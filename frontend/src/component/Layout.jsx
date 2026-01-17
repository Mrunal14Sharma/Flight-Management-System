import { Outlet } from "react-router-dom";
import Navbar from "./Navbar";

function Layout() {
    return (
        <div>
            <h1>Flight Management System</h1>
            <Navbar />
            <Outlet />
        </div>
    )
}

export default Layout;