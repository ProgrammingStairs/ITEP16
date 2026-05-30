import express from "express";
import { adminViewUserController,adminLogoutController,adminDeleteUserController, adminUpdateUserController, adminUserUpdateController } from "../controller/adminController.js";

var adminRouter = express.Router();

adminRouter.get("/home",(request,response)=>{
    response.render("adminProfile",{email : request.session.email});
});
adminRouter.get("/viewUsers",adminViewUserController);
adminRouter.get("/logout",adminLogoutController);
adminRouter.get("/delete/:email",adminDeleteUserController);
adminRouter.get("/update/:email",adminUpdateUserController);
adminRouter.post("/updateUser",adminUserUpdateController);
export default adminRouter;