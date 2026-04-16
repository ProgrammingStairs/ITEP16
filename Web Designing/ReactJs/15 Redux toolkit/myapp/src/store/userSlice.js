import {createSlice} from '@reduxjs/toolkit';
const initialState = {
    count : 0,
    tagLine : 'Default Tag Line'
}
const UserSlice = createSlice({
    name:'userSlice',
    initialState,
    reducers:{
        increment : (state)=>{
            state.count+=1;
        },
        decrement : (state)=>{
            state.count-=1;
        },
        reset : (state)=>{
            state.count=0;
        },
        setTagLine : (state,action)=>{
            // console.log(action);
            state.tagLine = action.payload;
        }
    }
});

export const {increment,decrement,reset,setTagLine} = UserSlice.actions;
export default UserSlice.reducer;
/*
    export const {increment,decrement,reset,setTagLine} = {
        increment : ()=>{
            return {type:'userSlice/increment',.....}    
        },
        decrement : ()=>{
            return {type:'userSlice/decrement',.....}    
        },
        reset : ()=>{
            return {type:'userSlice/reset',.....}    
        },
        ....
    };

    increment =  ()=>{
            return {type:'userSlice/increment',.....}    
        }

    when i call increment(), it returns {type:'userSlice/increment',.....} 
*/ 