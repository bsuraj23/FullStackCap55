import React, { Component } from 'react'
import UserService from '../services/UserService';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom'
import { withRouter } from 'react-router-dom'
//Icons
import AddIcon from '@mui/icons-material/Add';
import LoginIcon from '@mui/icons-material/Login';



class ListUser extends Component {
  constructor(props){
      super(props)
      this.state = {
          users : []
      }
      this.addUser = this.addUser.bind(this)
      this.editUser = this.editUser.bind(this)
      this.loginUser = this.loginUser.bind(this)
  }
  
  //
  componentDidMount() {
    UserService.getUsers().then((res) => {
            this.setState({ users : res.data})
      });
  }

  addUser() {
    this.props.history.push('/add-user');
  }
  
  editUser(id){
    this.props.history.push(`/update-user/${id}`); 
  }
  
  loginUser(){
    this.props.history.push('/login');
  }
  
  
  render() {

        return (
      <div>
        {/* <h4 className='text-center'></h4> */}

        <br />
        {/* <Link to="/add-user"> */}
            <button className='btn btn-primary ' onClick={this.addUser}>Add User<AddIcon /></button>
        {/* </Link> */}
          
            <button style={{marginLeft: "10px"}} className='btn btn-primary' onClick={this.loginUser}>Login<LoginIcon /></button>
        
          <br />
          <br />

        <div className='row'>
            <table className='table table-striped table-bordered'>
                <thead>
                    <tr>
                         <th>First name</th>
                         <th>Last name </th>
                         <th>Email</th>
                         <th>Address</th>
                         <th>Actions</th>
                    </tr>
                </thead>

                <tbody>
                    {
                        this.state.users.map(
                            user => 
                            <tr key= {user.id}>
                                <td> {user.firstName}</td>
                                <td> {user.lastName}</td>
                                <td> {user.email}</td>
                                <td> {user.contact.addressLine}</td>
                                <td>
                                  
                                  <button onClick={() => {
                                  this.editUser(user.id)
                                }} className='btn btn-info'>Update</button></td>
                            </tr> 
                        )
                    }

                </tbody>

            </table>
        </div>
      </div>
    )
  }
}

export default withRouter(ListUser)