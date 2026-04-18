import { createSlice } from "@reduxjs/toolkit";

const initialState={
    userArray:[],
    userObj:{},
    index:-1
}
const userSlice = createSlice({
    name:"userSlice",
    initialState,
    reducers:{
        addUser : (state,action)=>{
            if(state.index==-1){
                state.userArray = [...state.userArray,action.payload]
            }
            else 
            {
                state.userArray.splice(state.index,1,action.payload);
                state.userArray=[...state.userArray];
                state.index=-1;
                state.userObj={};
            }
        },
        deleteUser : (state,action)=>{
            state.userArray.splice(action.payload,1);
            state.userArray = [...state.userArray];
        },
        updateUser:(state,action)=>{
            console.log("-------------> ",action.payload);
            state.userObj = action.payload.user;
            state.index = action.payload.index;
        }
    }
});

export const {addUser,deleteUser,updateUser} = userSlice.actions;
export default userSlice.reducer;