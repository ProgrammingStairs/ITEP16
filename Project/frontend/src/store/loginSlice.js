import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";
const  initialState={
    loggedInEmail:'',
    message:'',
    status:'',
    role:''
}
const loginThunk = createAsyncThunk("loginSlice/loginThunk",async(obj,{rejectWithValue})=>{
    try{
        const result = await axios.post("http://localhost:8080/auth/login",obj,{
            withCredentials:true
        });
        /*
            As at the time of login, we do not pass cookie from here but it is responsible for setting up the cookie which is created at server side
            If you are using React / Axios

Then cookie will NOT be stored automatically unless:

axios.post("http://localhost:8080/auth/login", data, {
  withCredentials: true
})
            Without withCredentials: true → ❌ cookie ignored
        */
        console.log("Result in loginThunk : ",result);
        return result.data; 
    }catch(error){
        console.log(error);
         return rejectWithValue(); // used to redirect in rejected state in extra reducer
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
                state.loggedInEmail = action.payload.email;
                state.role = action.payload.role;
            })
            .addCase(loginThunk.rejected,(state,action)=>{
                console.log("inside extrareducer rejected : ",action.payload); 
            })
            
    }
})

export const {} = LoginSlice.actions;
export {loginThunk};
export default LoginSlice.reducer;