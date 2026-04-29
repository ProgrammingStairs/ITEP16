import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    loggedInEmail:'',
    message:'',
    status:''
}
const loginThunk = createAsyncThunk("loginSlice/loginThunk",async(obj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/auth/login",obj);
        console.log("Result in loginThunk : ",result);
        return result.data;
    }catch(error){
        console.log("Error in loginThunk : ",error);
        return rejectWithValue();
    }
});
const LoginSlice = createSlice({
    name:'loginSlice',
    initialState,
    reducers:{

    },
    extraReducers:(builder)=>{
        builder
            .addCase(loginThunk.pending,(state)=>{})
            .addCase(loginThunk.fulfilled,(state,action)=>{
                console.log("inside extrareducer fulfilled : ",action.payload);
                
            })
            .addCase(loginThunk.rejected,(state,action)=>{
                console.log("inside extrareducer rejected : ",action.payload);
                
            })
            
    }
})

export const {} = LoginSlice.actions;
export {loginThunk};
export default LoginSlice.reducer;