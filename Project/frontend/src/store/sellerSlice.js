import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    sellerObj:{}
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
    }
})

export const {} = SellerSlice.actions;
export {sellerRegistrationThunk};
export default SellerSlice.reducer;