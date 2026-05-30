import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { requestedURL } from "../utils.js";
import axios from "axios";
const initialState = {
    students : [],
    selectedStudent : {},
    index : -1,
    loginStatus : false,
    navShow:"home"
}

const addStudentThunk = createAsyncThunk('StudentSlice/addStudentThunk',async(studentData)=>{
    try{
        const result = await axios.post(requestedURL+'/addStudent',studentData);
        console.log("result inside thunk : ",result);
        return result; // it returns received data from server side to extraReducers addCase fulfilled case.
    }catch(error){
        console.log("Error in addStudentThunk : ",error);
    }        
});

const loginStudentThunk = createAsyncThunk('StudentSlice/loginStudentThunk',async(studentData)=>{
    try{
        const result = await axios.post(requestedURL+'/login',studentData);
        console.log("result inside thunk : ",result);
        return result; // it returns received data from server side to extraReducers addCase fulfilled case.
    }catch(error){
        console.log("Error in loginStudentThunk : ",error);
    }        
});

const viewStudentThunk = createAsyncThunk('StudentSlice/viewStudentThunk',async()=>{
    try{
        const result = await axios.get(requestedURL+'/viewStudentList');
        console.log("result inside thunk : ",result);
        return result; // it returns received data from server side to extraReducers addCase fulfilled case.
    }catch(error){
        console.log("Error in viewStudentThunk : ",error);
    }        
});

const deleteStudentThunk = createAsyncThunk('StudentSlice/deleteStudentThunk',async(studentData)=>{
    try{
        const result = await axios.post(requestedURL+'/delete',studentData);
        console.log("result inside thunk : ",result);
        return result; // it returns received data from server side to extraReducers addCase fulfilled case.
    }catch(error){
        console.log("Error in deleteStudentThunk : ",error);
    }        
});

const updateStudentThunk = createAsyncThunk('StudentSlice/updateStudentThunk',async(studentData)=>{
    try{
        const result = await axios.post(requestedURL+'/updateStudent',studentData);
        console.log("result inside thunk : ",result);
        return result; // it returns received data from server side to extraReducers addCase fulfilled case.
    }catch(error){
        console.log("Error in updateStudentThunk : ",error);
    }        
});

const studentSlice = createSlice({
    name:'StudentSlice',
    initialState,
    reducers:{
         addStudent:(state,action)=>{
            //console.log(action);
                if(state.index==-1){
                    state.students = [...state.students,action.payload]
                }else{
                    state.students.splice(state.index,1,action.payload);
                    state.index=-1;
                }
            console.log(state.students);    
         },
         loginStudent:(state,action)=>{
                // console.log(action);
                // console.log(state.students.length);
                const res = state.students.filter((stud)=>{
                    return stud.email==action.payload.email && stud.password==action.payload.password;
                });
                if(res.length!=0){
                    state.loginStatus=true;
                    state.navShow='login'
                }else{
                    state.loginStatus=false
                }
         },
         updateStudent:(state,action)=>{
            console.log(action);
            state.selectedStudent = action.payload.stud; 
            state.index = action.payload.index;
         },
         deleteStudent:(state,action)=>{
            state.students.splice(action.payload,1);
         },
         logoutStudent: (state)=>{
            state.loginStatus=false;
            state.navShow="home";
         }
    },
    extraReducers:(builder)=>{
        builder
        .addCase(addStudentThunk.pending,(state)=>{
        })
        .addCase(addStudentThunk.fulfilled,(state,action)=>{
            console.log("action : ",action);
        })
        .addCase(addStudentThunk.rejected,(state)=>{
        })

        builder
        .addCase(loginStudentThunk.pending,(state)=>{
        })
        .addCase(loginStudentThunk.fulfilled,(state,action)=>{
            state.navShow="login"
        })
        .addCase(loginStudentThunk.rejected,(state)=>{
        })

        builder
        .addCase(viewStudentThunk.pending,(state)=>{
        })
        .addCase(viewStudentThunk.fulfilled,(state,action)=>{
            // console.log("action : ",action.payload.data.studentList);
            state.students = action.payload.data.studentList;
        })
        .addCase(viewStudentThunk.rejected,(state)=>{
        })

        builder
        .addCase(deleteStudentThunk.pending,(state)=>{
        })
        .addCase(deleteStudentThunk.fulfilled,(state,action)=>{
            console.log("want to delete student whose index is : ",action.payload.data.studentIndex);
            state.students.splice(action.payload.data.studentIndex,1);
        })
        .addCase(deleteStudentThunk.rejected,(state)=>{
        })

        builder
        .addCase(updateStudentThunk.pending,(state)=>{
        })
        .addCase(updateStudentThunk.fulfilled,(state,action)=>{
        })
        .addCase(updateStudentThunk.rejected,(state)=>{
        })

    }

});

export {addStudentThunk,loginStudentThunk,viewStudentThunk,deleteStudentThunk,updateStudentThunk};
export const {addStudent,loginStudent,updateStudent,deleteStudent,logoutStudent} = studentSlice.actions;
export default studentSlice.reducer;
