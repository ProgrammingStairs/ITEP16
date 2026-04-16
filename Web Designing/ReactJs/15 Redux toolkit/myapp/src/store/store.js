import { configureStore } from "@reduxjs/toolkit";
import userSlice from '../store/userSlice.js';
export default configureStore({
    reducer:{
        user : userSlice
    }
});