export const insertValues = (request)=>{
    const {username,email,password,address} = request.body;
    return [
        username,
        email,
        password,
        address
    ];
}