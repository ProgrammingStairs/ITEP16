import banner from '../public/images/register.jpg';
function UserRegister() {
    return (<div className="row p-5">
        <div className="col-lg-4">
            <img src={banner} className='d-block w-100' alt="Image" />
        </div>
        <div className="col-lg-8 row">
            <h4>Register Form | User</h4>
            <form className="form-control">
                <div style={{ height: "auto", float: "left", marginLeft: "40px" }} className='col-lg-5'>
                    <div class="mb-3">
                        <label class="form-label">Username</label>
                        <input
                            type="text"
                            class="form-control"
                            name="username"
                            placeholder='Enter Username'
                        />
                    </div>
                      <div class="mb-3">
                        <label class="form-label">Email address</label>
                        <input
                            type="email"
                            class="form-control"
                            name="email"
                            placeholder='Enter Email'
                        />
                    </div>
                     <div class="mb-3">
                        <label class="form-label">Password</label>
                        <input
                            type="password"
                            class="form-control"
                            name="password"
                            placeholder='Enter Password'
                        />
                    </div>

                </div>
                <div style={{ height: "auto", float: "left", marginLeft: "40px" }} className='col-lg-5'>
   <div class="mb-3">
                        <label class="form-label">Contact</label>
                        <input
                            type="text"
                            class="form-control"
                            name="contact"
                            placeholder='Enter 10-Digit Mobile No.'
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Gender : &nbsp;</label>
                        <input
                            type="radio"
                            class="radio-inline"
                            name="gender"
                            id="male"
                            value="Male"
                        /><label for="male">&nbsp;Male&nbsp;</label>
                        <input
                            type="radio"
                            class="radio-inline"
                            name="gender"
                            id="female"
                            value="Female"
                        /><label for="male">&nbsp;Female&nbsp;</label>
                    </div>
                </div>
                <button type="submit" class="btn btn-dark w-100">Register</button>
            </form>
        </div>

    </div>);
}
export default UserRegister;