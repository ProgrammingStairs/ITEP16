import express from 'express';
import { addStudentController, loginStudentController, viewStudentListController, updateStudentController,deleteStudentController } from '../controller/studentController.js';

var studentRouter = express.Router();

studentRouter.post('/login',loginStudentController);
studentRouter.post('/addStudent',addStudentController);
studentRouter.get('/viewStudentList',viewStudentListController);
studentRouter.post('/updateStudent',updateStudentController);
studentRouter.post('/delete',deleteStudentController);

export default studentRouter;