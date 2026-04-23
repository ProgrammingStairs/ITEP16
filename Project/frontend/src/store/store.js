import { configureStore } from "@reduxjs/toolkit";
import adminSlice from './adminSlice.js';
import sellerSlice from './sellerSlice.js';
import commonSlice from './commonSlice.js';
import userSlice from './userSlice.js';

export default configureStore({
    reducer:{
        admin:adminSlice,
        user:userSlice,
        seller : sellerSlice,
        common:commonSlice
    }
});