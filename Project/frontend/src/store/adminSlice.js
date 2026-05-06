import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    sellerList:[]
}
const adminSellerListThunk = createAsyncThunk("adminSlice/adminSellerListThunk",async(_,{rejectWithValue})=>{
    try{
        const result = await axios.get("http://localhost:8080/admin/adminSellerList",{
            withCredentials:true
        });
        console.log("result in adminSellerListthunk : ",result);
        return result.data;
    }catch(error){
        console.log("Error in adminSellerListThunk : ",error);
        return rejectWithValue();
    }    
})
const adminVerifySellerThunk = createAsyncThunk("adminSlice/adminVerifySellerThunk",async(sellerObj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/admin/adminVerifySeller",sellerObj,{
            withCredentials:true
        });
        console.log("result in adminVerifySellerthunk : ",result);
        return result.data;
    }catch(error){
        console.log("Error in adminVerifySellerThunk : ",error);
        return rejectWithValue();
    }    
})

const AdminSlice = createSlice({
    name:'adminSlice',
    initialState,
    reducers:{

    },
    extraReducers:(builder)=>{
            builder 
                .addCase(adminSellerListThunk.pending,(state)=>{})
                .addCase(adminSellerListThunk.fulfilled,(state,action)=>{
                    console.log("fulfilled : ",action.payload);
                    state.sellerList = action.payload;  
                })
                .addCase(adminSellerListThunk.rejected,(state)=>{})

            builder 
                .addCase(adminVerifySellerThunk.pending,(state)=>{})
                .addCase(adminVerifySellerThunk.fulfilled,(state,action)=>{
                    console.log("fulfilled : ",action.payload);
                   
                })
                .addCase(adminVerifySellerThunk.rejected,(state)=>{})
                
    }
})

export const {} = AdminSlice.actions;
export {adminSellerListThunk,adminVerifySellerThunk};
export default AdminSlice.reducer;