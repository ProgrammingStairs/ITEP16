import mongoose from 'mongoose';
import url from '../connection/dbConnection.js';
mongoose.connect(url);
const StudentSchema = mongoose.Schema({
    username : {
        type:String,
        required : true
    },
    email : {
        type:String,
        required : true,
        unique:true
    },
    password : {
        type:String,
        required : true
    },
    address : {
        type:String,
        required : true
    }
});

export default mongoose.model('studentSchema',StudentSchema,'student');
