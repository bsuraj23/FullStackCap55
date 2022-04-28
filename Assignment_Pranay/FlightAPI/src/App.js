import CreateUserComponent from './components/CreateUserComponent'
import ListUserComponent from './components/ListUserComponent';
import UpdateUserComponent from './components/UpdateUserComponent';
import LoggedUserComponent from './components/LoggedUserComponent';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import Footer from './components/Footer';
import Header from './components/Header';
import LoginUserComponent from './components/LoginUserComponent';

function App() {
  return (
    <div>
        <Router>
              <Header />
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ListUserComponent}></Route>
                          <Route path = "/users" component = {ListUserComponent}></Route>
                          <Route path = "/add-user" component = {CreateUserComponent}></Route>
                          <Route path = "/update-user/:id" component = {UpdateUserComponent}></Route>
                          <Route path = "/login" component = {LoginUserComponent}></Route>
                          <Route path ='/user-dashboard' component={LoggedUserComponent}></Route>
                    </Switch>
                </div>
              <Footer />
        </Router>
    </div>
      
    
  );
}

export default App
