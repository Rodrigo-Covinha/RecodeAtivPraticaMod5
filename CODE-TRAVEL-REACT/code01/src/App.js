import React from 'react';

import {  BrowserRouter, Switch, Route } from 'react-router-dom';

import Header from './components/Header';
import Footer from './components/Footer';
import Main from './pages/Main/Home';
import Destinos from './pages/Destinos/Destinos';
import Ofertas from './pages/Ofertas/Ofertas';
import Contato from './pages/Contato/Contato';
import Login from './pages/Login/Login';
import CreateAgendamentoComponent from './components/CreateAgendamentoComponent';
import ViewAgendamentoComponent from './components/ViewAgendamentoComponent';
import ListAgendamentoComponent from './components/ListAgendamentoComponent';


function App() {
  return (
  
      <div>
        <BrowserRouter>
          <Header />
         
            <Switch>
              <Route path= "/" exact component={Main}/>
              <Route path= "/Destinos" component={Destinos}/>
              <Route path="/agendamentos"  component={ListAgendamentoComponent}/>
              <Route path="/agendamentos" component={ListAgendamentoComponent}/>
              <Route path="/add-agendamento/:id" component={CreateAgendamentoComponent}/>
              <Route path="/view-agendamento/:id" component={ViewAgendamentoComponent}/>
              <Route path= "/Ofertas" component={Ofertas}/> 
              <Route path= "/Contato" component={Contato}/> 
              <Route path= "/Login" component={Login}/> 
            </Switch>
        
          <Footer />
        </BrowserRouter>
      </div>

   
  );
}

export default App;
