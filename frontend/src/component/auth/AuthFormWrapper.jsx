function AuthFromWrapper({ title, children }) {
    return (
        <div style={{ maxWidth: "400px", margin: "40px auto" }}>
            <h2>{title}</h2>
            <form>
                {children}
            </form>
        </div>
    )
}

export default AuthFromWrapper;