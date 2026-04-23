import banner from '../public/images/login1.jpg';
function Login(){
    return(<div className="row p-5">
        <div className="col-lg-6">
            <img src={banner} className='d-block w-100' alt="Image"/>
        </div>
        <div className="col-lg-6 p-5">
            <h4>Login Form</h4>
            <form>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input 
        type="email" 
        class="form-control" 
        id="exampleInputEmail1" 
        aria-describedby="emailHelp"
        name="email"
        placeholder='Enter Email'    
    />
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input 
        type="password" 
        class="form-control" 
        id="exampleInputPassword1"
        name="password"
        placeholder='Enter Password'    
    />
  </div>
  <button type="submit" class="btn btn-dark w-100">Login</button>
</form>
        </div>
    </div>);
}
export default Login;