import { response } from "express";
import studentSchema from "../model/studentSchema.js";

export const addStudentController = async (request,response)=>{
    try{
        const res = await studentSchema.create(request.body);
        console.log("res : ",res);
        response.status(201).send({status:true});
    }catch(error){
        console.log("Error occured while adding Student");
        response.status(500).send({status:false});
    }
}

export const loginStudentController = async (request,response)=>{
    try{
        const search = {
            $and : [
                {email : request.body.email},
                {password : request.body.password}
            ]
        }
        const res = await studentSchema.findOne(search);
        console.log("res : ",res);
        response.status(201).send({status:true});
    }catch(error){
        console.log("Error occured while logging Student");
        response.status(500).send({status:false});
    }
}

export const viewStudentListController = async (request,response)=>{
    try{
        const studentList = await studentSchema.find();
        // console.log("studentList : ",studentList);
        response.status(200).send({status:true,studentList:studentList});
    }catch(error){
        console.log("Error occured while viewing Student list");
        response.status(500).send({status:false});
    }
}

export const updateStudentController = async(request,response)=>{
    try{
        const res = await studentSchema.updateOne({email:request.body.email},request.body);
        console.log("res : ",res);
        response.status(201).send({status:true});    
    }catch(error){
        console.log("Error occured while updating student : ",error);
        response.status(500).send({status:false});
    }
}

export const deleteStudentController = async(request,response)=>{
    try{
        // console.log("--------- : ",request.body);
        
        const res = await studentSchema.deleteOne({email:request.body.stud.email});
        console.log("res : ",res);
        response.status(201).send({status:true,studentIndex : request.body.index});    
    }catch(error){
        console.log("Error occured while updating student : ",error);
        response.status(500).send({status:false});
    }
}