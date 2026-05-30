import {configureStore} from '@reduxjs/toolkit';
import studentSlice from './studentSlice.js';
export default configureStore({
    reducer:{
        student : studentSlice
    }
});