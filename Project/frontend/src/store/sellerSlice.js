import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    sellerObj:{},
    mobileList:[]
}
const sellerRegistrationThunk = createAsyncThunk("sellerSlice/sellerRegistrationThunk",async(obj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/seller/registration",obj);
        console.log("result in seller registration : ",result.data);
        return result.data;
    }catch(error){
        console.log("error in seller registration thunk : ",error);
        return rejectWithValue();
    }
})
const sellerAddMobileThunk = createAsyncThunk("sellerSlice/sellerAddMobileThunk",async(obj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/seller/addMobile",obj,{
            withCredentials:true
        });
        console.log("result in sellerAddMobileThunk : ",result.data);
        return result.data;
    }catch(error){
        console.log("error in sellerAddMobileThunk : ",error);
        return rejectWithValue();
    }
})
const sellerMobileListThunk = createAsyncThunk("sellerSlice/sellerMobileListThunk",async(_,{rejectWithValue})=>{
    try{
        const result = await axios.get("http://localhost:8080/seller/sellerMobileList",{
            withCredentials:true
        });
        console.log("result in sellerMobileListThunk : ",result);
        return result.data;
    }catch(error){
        console.log("Error in sellerMobileListThunk : ",error);
        return rejectWithValue();
    }    
})

const SellerSlice = createSlice({
    name:'sellerSlice',
    initialState,
    reducers:{

    },
    extraReducers:(builder)=>{
        builder 
            .addCase(sellerRegistrationThunk.pending,(state)=>{})
            .addCase(sellerRegistrationThunk.fulfilled,(state,action)=>{

            })
            .addCase(sellerRegistrationThunk.rejected,(state)=>{})

        builder 
            .addCase(sellerAddMobileThunk.pending,(state)=>{})
            .addCase(sellerAddMobileThunk.fulfilled,(state,action)=>{

            })
            .addCase(sellerAddMobileThunk.rejected,(state)=>{})

        builder 
            .addCase(sellerMobileListThunk.pending,(state)=>{})
            .addCase(sellerMobileListThunk.fulfilled,(state,action)=>{
                console.log("fulfilled : ",action.payload);
                state.mobileList = action.payload;  
            })
            .addCase(sellerMobileListThunk.rejected,(state)=>{})
        
    }
})

export const {} = SellerSlice.actions;
export {sellerRegistrationThunk,sellerAddMobileThunk,sellerMobileListThunk};
export default SellerSlice.reducer;