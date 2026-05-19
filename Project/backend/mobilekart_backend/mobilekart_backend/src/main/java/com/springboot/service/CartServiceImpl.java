package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.CartResponseDTO;
import com.springboot.entity.Cart;
import com.springboot.entity.MobileVariant;
import com.springboot.repository.CartRepository;
import com.springboot.repository.MobileRepository;
import com.springboot.repository.MobileVariantRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartServiceImpl implements CartService{
		
	private CartRepository cartRepository;
	private MobileVariantRepository mobileVariantRepository;
	public CartServiceImpl(CartRepository cartRepository,MobileVariantRepository mobileVariantRepository) {
		this.cartRepository = cartRepository;
		this.mobileVariantRepository = mobileVariantRepository;
	}
	
	@Override
	public List<CartResponseDTO> viewCartList(int id){
		List<Cart> cartList = cartRepository.findByUserid(id);
		List<CartResponseDTO> list = cartList.stream().map((m)->{
			MobileVariant variantObj =  mobileVariantRepository.findById(m.getVariantid())
					.orElseThrow(()-> new RuntimeException("Mobile Variant Not Found"));
			String brand = variantObj.getMobile().getBrand();
			String modelName = variantObj.getMobile().getModelname();
			return new CartResponseDTO(
					m.getCartid(),
					id,
					m.getVariantid(),
					m.getQuantity(),
					m.getPrice(),
					brand,
					modelName
			);
		}).toList();
		return list;
	}
	
	public String removeCartItem(int cartid) {
		cartRepository.deleteById(cartid);
		return "Cart Item deleted Successfully";
	}
}
