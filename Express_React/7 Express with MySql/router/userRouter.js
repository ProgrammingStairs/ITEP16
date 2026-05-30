import express from "express";
import { userRegistration,userLogin, userLogoutController,userUpdateController,updateUserController } from "../controller/userController.js";
var userRouter = express.Router();

userRouter.get("/register",(request,response)=>{
    response.render("register",{msg:""});
});
userRouter.get("/login",(request,response)=>{
    response.render("login",{msg:""});
});
userRouter.get("/home",(request,response)=>{
    response.render("userProfile",{msg:"",email : request.session.email});
});

userRouter.post("/register",userRegistration);
userRouter.post("/login",userLogin);
userRouter.get("/viewProfile/:email",userUpdateController);
userRouter.post("/updateUser",updateUserController);
userRouter.get("/logout",userLogoutController);


export default userRouter;