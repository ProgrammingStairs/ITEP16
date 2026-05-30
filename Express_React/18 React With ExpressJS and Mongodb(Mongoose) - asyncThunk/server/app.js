import express from 'express';
import cors from 'cors';
import studentRouter from './router/studentRouter.js';

var app = express();

app.use(cors());
app.use(express.urlencoded({extended:true}));
app.use(express.json());
app.use('/student',studentRouter);

app.listen(3001,()=>{
    console.log("Connection established successfully");
});