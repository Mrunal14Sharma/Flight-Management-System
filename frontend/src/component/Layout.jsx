import { Outlet } from "react-router-dom";

function Layout(){
    return(
        <div>
            <h1>Flight Management System</h1>
            <Outlet />
        </div>
    )
}

export default Layout;