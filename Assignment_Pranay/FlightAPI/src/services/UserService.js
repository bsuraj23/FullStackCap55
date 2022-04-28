import axios from 'axios';

const GET_URL = "http://localhost:8080/api/get_user/";
const REGISTER_URL = "http://localhost:8080/api/register/";
const PUT_URL = 'http://localhost:8080/api/update_user/'
const LOGIN_URL = 'http://localhost:8080/api/login/'
class UserService{
    
    // Get : http://localhost:8080/api/get_user/
    getUsers(){
        return axios.get(GET_URL);
    }
    // Post :  http://localhost:8080/api/register/
    createUsers(user){
        return axios.post(REGISTER_URL,user);

    }
    getUserById(userId){
        return axios.get(GET_URL + userId);
    }
    // Put : http://localhost:8080/api/update_user/?id=
    updateUser(user,userId){
        return axios.put(PUT_URL +'?id='+ userId, user);
    }
    // Post : http://localhost:8080/api/login/?userValue=userName
    loginUser(userName){
        return axios.put(LOGIN_URL, + '?userValue=',userName)
    }
}

export default new UserService()