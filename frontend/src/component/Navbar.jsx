import { ROUTES } from "../constants/route";

function Navbar() {
    return (
        <nav>
            <ul>
                <li><a href={ROUTES.HOME}>Home</a></li>
                <li><a href={ROUTES.FLIGHTS}>Flights</a></li>
                <li><a href={ROUTES.BOOKINGS}>Bookings</a></li>
                <li><a href={ROUTES.PROFILE}>Profile</a></li>
                <li><a href={ROUTES.LOGIN}>Login</a></li>
                <li><a href={ROUTES.SIGNUP}>Signup</a></li>
            </ul>
        </nav>
    )
}

export default Navbar;