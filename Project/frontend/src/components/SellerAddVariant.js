function SellerAddVariant() {
    return (<div className="row p-3">
            <h4>Add Variant</h4>
            <form className="form-control" encType="multipart/form-data">
                <div class="row">
                <div className="col-lg-4" style={{height:"auto"}}>
                        <div class="mb-3">
                        <label class="form-label">Price</label>
                        <input
                            type="text"
                            class="form-control"
                            name="price"
                            placeholder='Enter Price'
                        /></div>
<div class="mb-3">
                        <label class="form-label">Discounted Price</label>
                        <input
                            type="text"
                            class="form-control"
                            name="discountprice"
                            placeholder='Enter Discounted Price'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Stock</label>
                        <input
                            type="number"
                            class="form-control"
                            name="stock"
                            placeholder='Enter Stock'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">SKU</label>
                        <input
                            type="text"
                            class="form-control"
                            name="sku"
                            placeholder='Enter SKU'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Color</label>
                        <input
                            type="text"
                            class="form-control"
                            name="color"
                            placeholder='Enter Color'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">RAM</label>
                        <input
                            type="text"
                            class="form-control"
                            name="ram"
                            placeholder='Enter RAM'
                        /></div>
                </div>
                <div className="col-lg-4" style={{height:"auto"}}>
                    <div class="mb-3">
                        <label class="form-label">Storage</label>
                        <input
                            type="text"
                            class="form-control"
                            name="storage"
                            placeholder='Enter Storage'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Processor</label>
                        <input
                            type="text"
                            class="form-control"
                            name="processor"
                            placeholder='Enter Processor'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">DisplaySize</label>
                        <input
                            type="text"
                            class="form-control"
                            name="displaysize"
                            placeholder='Enter Display Size'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Display Type</label>
                        <input
                            type="text"
                            class="form-control"
                            name="displaytype"
                            placeholder='Enter Display Type'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Battery</label>
                        <input
                            type="text"
                            class="form-control"
                            name="battery"
                            placeholder='Enter Battery'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Operating System</label>
                        <input
                            type="text"
                            class="form-control"
                            name="operatingsystem"
                            placeholder='Enter Operating System'
                        /></div>
                </div>
                <div className="col-lg-4" style={{height:"auto"}}>
<div class="mb-3">
                        <label class="form-label">RearCamera</label>
                        <input
                            type="text"
                            class="form-control"
                            name="rearcamera"
                            placeholder='Enter Rear Camera'
                        /></div>
<div class="mb-3">
                        <label class="form-label">FrontCamera</label>
                        <input
                            type="text"
                            class="form-control"
                            name="frontcamera"
                            placeholder='Enter Front Camera'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Network</label>
                        <input
                            type="text"
                            class="form-control"
                            name="network"
                            placeholder='Enter Network'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">SimType</label>
                        <input
                            type="text"
                            class="form-control"
                            name="simtype"
                            placeholder='Enter Sim Type'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Weight</label>
                        <input
                            type="text"
                            class="form-control"
                            name="weight"
                            placeholder='Enter Weight'
                        /></div>
                        <div class="mb-3">
                        <label class="form-label">Upload</label>
                        <input
                            type="file"
                            class="form-control"
                            name="mobileimage"
                        /></div>
                </div>
                </div>
                <button type="submit" class="btn btn-dark w-100">Add Mobile</button>
            </form>
        </div>);
}
export default SellerAddVariant;