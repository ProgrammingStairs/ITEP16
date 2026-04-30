import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    loggedInEmail:''
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

        }
})

export const {} = UserSlice.actions;
export {userRegistrationThunk};
export default UserSlice.reducer;