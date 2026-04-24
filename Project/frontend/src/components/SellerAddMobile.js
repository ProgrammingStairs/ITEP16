function SellerAddMobile() {
    return (<div className="row p-5">
        <div className="col-lg-3" style={{height:"auto",padding:"5px"}}>
            <h4>Add Mobile</h4>
            <form className="form-control">
                    <div class="mb-3">
                        <label class="form-label">Brand</label>
                        <input
                            type="text"
                            class="form-control"
                            name="brand"
                            placeholder='Enter Brand'
                        />
                    </div>
                      <div class="mb-3">
                        <label class="form-label">Model Name</label>
                        <input
                            type="text"
                            class="form-control"
                            name="model"
                            placeholder='Enter Model Name'
                        />
                    </div>
                     <div class="mb-3">
                        <label class="form-label">Description</label>
                        <textarea
                            class="form-control"
                            name="description"
                            placeholder='Enter Description'
                        ></textarea>
                    </div>
                <button type="submit" class="btn btn-dark w-100">Add Mobile</button>
            </form>
        </div>
        <div className="col-lg-9" style={{height:"auto"}}>
             <h4>Mobile List</h4>
             <table border={1} cellSpacing={0} cellPadding={1} className="table">
                <tr>
                    <th>S.No</th>
                    <th>Brand</th>
                    <th>Model</th>
                    <th>Description</th>
                    <th>Action</th>
                </tr>
             </table>
        </div>

    </div>);
}
export default SellerAddMobile;