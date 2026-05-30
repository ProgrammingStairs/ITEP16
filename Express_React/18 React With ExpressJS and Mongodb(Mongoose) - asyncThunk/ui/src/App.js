import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import AddStudent from './component/AddStudent';
import Home from './component/Home';
import Login from './component/Login';
import UpdateStudentForm from './component/UpdateStudentForm';
import ViewStudents from './component/ViewStudents';
import Navbar from './component/Navbar';

function App() {
  return (<>
      <Navbar/>
      <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/addStudent' element={<AddStudent/>}/>
          <Route path='/loginStudent' element={<Login/>}/>
          <Route path='/viewStudents' element={<ViewStudents/>}/>
          <Route path='/updateStudentForm' element={<UpdateStudentForm/>}/>
          <Route path='/logout' element={<Login/>}/>
      </Routes>
  </>);
}

export default App;
