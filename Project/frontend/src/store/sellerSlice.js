import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    sellerObj:{}
}
const sellerRegisterThunk = createAsyncThunk("sellerSlice/sellerRegisterThunk",async(sellerObj)=>{
    try{
        const result = await axios.post("http://localhost:8080/seller/register",sellerObj);
        console.log("result : ",result);
        return result;
    }catch(error){

    }
})
const SellerSlice = createSlice({
    name:'sellerSlice',
    initialState,
    reducers:{

    },
    extraReducers:(builder)=>{
        builder 
            .addCase(sellerRegisterThunk.pending,(state)=>{})
            .addCase(sellerRegisterThunk.fulfilled,(state,action)=>{

            })
            .addCase(sellerRegisterThunk.rejected,(state)=>{})
    }
})

export const {} = SellerSlice.actions;
export default SellerSlice.reducer;