import AuthFromWrapper from "../../component/auth/AuthFormWrapper";

function Signup() {
    return (
        <AuthFromWrapper title="Signup">
            <div>
                <label>Name</label>
                <input type="text" />
            </div>

            <div>
                <label>Email</label>
                <input type="email" />
            </div>

            <div>
                <label>Password</label>
                <input type="password" />
            </div>

            <button type="submit">Signup</button>
        </AuthFromWrapper>
    )
}

export default Signup;