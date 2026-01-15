import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Layout from './component/Layout'
import Home from './pages/Home'
import Flights from './pages/Flights'
import FlightDetails from './pages/FlightDetails'
import Bookings from './pages/Bookings'
import Profile from './pages/Profile'
import NotFound from './pages/NotFound'
import Login from './pages/Login'
import Signup from './pages/Signup'

function App() {

  return (
    <BrowserRouter>
    <Routes>
      <Route path='/'element={<Layout/>}>
      <Route index element={<Home/>} />
      <Route path='flights' element={<Flights/>} />
      <Route path='flight:/id' element={<FlightDetails/>} />
      <Route path='bookings' element={<Bookings/>} />
      <Route path='profile' element={<Profile/>} />
      </Route>

      <Route path='/login' element={<Login/>} />
      <Route path='/signup' element={<Signup/>} />
      <Route path='*' element={<NotFound/>} />
    </Routes>
    </BrowserRouter>
  )
}

export default App
