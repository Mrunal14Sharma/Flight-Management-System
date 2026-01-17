import AuthFromWrapper from "../../component/auth/AuthFormWrapper";

function Login() {
    return (
        <AuthFromWrapper title="Login">
            <div>
                <label>Email</label>
                <input type="email" />
            </div>

            <div>
                <label>Password</label>
                <input type="password" />
            </div>

            <button type="submit">Login</button>
        </AuthFromWrapper>
    )
}

export default Login;