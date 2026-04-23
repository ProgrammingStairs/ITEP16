import { createSlice } from "@reduxjs/toolkit";
const  initialState={
    navShow:"home"
}
const CommonSlice = createSlice({
    name:'commonSlice',
    initialState,
    reducers:{
        setNavShow:(state,action)=>{
            state.navShow = action.payload;
        }
    }
})

export const {setNavShow} = CommonSlice.actions;
export default CommonSlice.reducer;