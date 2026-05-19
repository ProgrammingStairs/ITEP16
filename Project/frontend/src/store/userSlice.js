import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    loggedInEmail:'',
    mobileListWithVariant:[],
    cartArray:[],
    placeOrderListArray : []
}
const userRegistrationThunk = createAsyncThunk("userSlice/userRegistrationThunk",async(obj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/user/registration",obj);
        console.log("result in user registration : ",result.data);
        return result.data;
    }catch(error){
        console.log("error in user registration thunk : ",error);
        return rejectWithValue();
    }
})
const userViewMobileListThunk = createAsyncThunk("userSlice/userViewMobileListThunk",async(_,{rejectWithValue})=>{
    try{
        const result = await axios.get("http://localhost:8080/user/userViewMobileList",{
            withCredentials:true
        });
        console.log("result in userViewMobileListThunk : ",result);
        return result.data;
    }catch(error){
        console.log("Error in userViewMobileListThunk : ",error);
        return rejectWithValue();
    }    
})
const addToCartThunk = createAsyncThunk("userSlice/addToCartThunk",async(obj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/user/addToCart",obj,{
            withCredentials:true
        });
        console.log("result in addToCartThunk : ",result.data);
        return result.data;
    }catch(error){
        console.log("error in addToCartThunk : ",error);
        return rejectWithValue();
    }
})
const viewCartThunk = createAsyncThunk("userSlice/viewCartThunk",async(_,{rejectWithValue})=>{
    try{
        const result = await axios.get("http://localhost:8080/cart/viewCart",{
            withCredentials:true
        });
        console.log("result in viewCartThunk : ",result);
        return result.data;
    }catch(error){
        console.log("Error in viewCartThunk : ",error);
        return rejectWithValue();
    }    
})
const removeItemThunk = createAsyncThunk("userSlice/removeItemThunk",async(cartid,{dispatch,rejectWithValue})=>{
    try{
        const result = await axios.get(`http://localhost:8080/cart/removeItem/${cartid}`,{
            withCredentials:true
        });
        console.log("result in removeItemThunk : ",result);
        dispatch(viewCartThunk());
        return result.data;
    }catch(error){
        console.log("Error in removeItemThunk : ",error);
        return rejectWithValue();
    }    
})
const placeOrderThunk = createAsyncThunk("userSlice/placeOrderThunk",async(obj,{dispatch,rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/user/placeOrder",obj,{
            withCredentials:true
        });
        console.log("result in placeOrderThunk : ",result.data);
        dispatch(viewCartThunk());
        return result.data;
    }catch(error){
        console.log("error in placeOrderThunk : ",error);
        return rejectWithValue();
    }
})
const placeOrderListThunk = createAsyncThunk("userSlice/placeOrderListThunk",async(_,{rejectWithValue})=>{
    try{
        const result = await axios.get("http://localhost:8080/user/placeOrderList",{
            withCredentials:true
        });
        console.log("result in placeOrderListThunk : ",result.data);
        return result.data;
    }catch(error){
        console.log("error in placeOrderListThunk : ",error);
        return rejectWithValue();
    }
})


const UserSlice = createSlice({
    name:'userSlice',
    initialState,
    reducers:{

    },
    extraReducers:(builder)=>{
        builder
            .addCase(userRegistrationThunk.pending,(state)=>{})
            .addCase(userRegistrationThunk.fulfilled,(state,action)=>{
                
            })
            .addCase(userRegistrationThunk.rejected,(state)=>{})

        builder 
            .addCase(userViewMobileListThunk.pending,(state)=>{})
            .addCase(userViewMobileListThunk.fulfilled,(state,action)=>{
                console.log("fulfilled : ",action.payload);
                state.mobileListWithVariant = action.payload;  
            })
            .addCase(userViewMobileListThunk.rejected,(state)=>{})
        
        builder
            .addCase(addToCartThunk.pending,(state)=>{})
            .addCase(addToCartThunk.fulfilled,(state,action)=>{
                
            })
            .addCase(addToCartThunk.rejected,(state)=>{})

        builder 
            .addCase(viewCartThunk.pending,(state)=>{})
            .addCase(viewCartThunk.fulfilled,(state,action)=>{
                console.log("fulfilled : ",action.payload);
                state.cartArray = action.payload;  
            })
            .addCase(viewCartThunk.rejected,(state)=>{})

        builder 
            .addCase(removeItemThunk.pending,(state)=>{})
            .addCase(removeItemThunk.fulfilled,(state,action)=>{
                 
            })
            .addCase(removeItemThunk.rejected,(state)=>{})

        builder 
            .addCase(placeOrderThunk.pending,(state)=>{})
            .addCase(placeOrderThunk.fulfilled,(state,action)=>{
                 
            })
            .addCase(placeOrderThunk.rejected,(state)=>{})
    
        builder 
            .addCase(placeOrderListThunk.pending,(state)=>{})
            .addCase(placeOrderListThunk.fulfilled,(state,action)=>{
                state.placeOrderListArray = action.payload
            })
            .addCase(placeOrderListThunk.rejected,(state)=>{})
        
        }
})

export const {} = UserSlice.actions;
export {userRegistrationThunk,userViewMobileListThunk,addToCartThunk,viewCartThunk,removeItemThunk,placeOrderThunk,placeOrderListThunk};
export default UserSlice.reducer;