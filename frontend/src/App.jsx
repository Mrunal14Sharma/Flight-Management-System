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
import { ROUTES } from './constants/route'

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Layout />}>
          <Route index element={<Home />} />
          <Route path={ROUTES.FLIGHTS} element={<Flights />} />
          <Route path={ROUTES.FLIGHT_DETAILS} element={<FlightDetails />} />
          <Route path={ROUTES.BOOKINGS} element={<Bookings />} />
          <Route path={ROUTES.PROFILE} element={<Profile />} />
        </Route>

        <Route path={ROUTES.LOGIN} element={<Login />} />
        <Route path={ROUTES.SIGNUP} element={<Signup />} />
        <Route path='*' element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
