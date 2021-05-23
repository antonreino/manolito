<html xmlns:th="https://www.thymeleaf.org">
    <head>
        <title>El login de mi web</title>
        <th:block th:include="fragments/head :: genericHead"></th:block>
    </head>
    <body class="loginbg">
        <div class="vertical-flex-wrapper">
            <div class="login-content">
            <form name="f" th:action="@{/login}" method="post">

                <legend>Identif�cate</legend>
                <div th:if="${param.error}" class="alert alert-error">
                    Usuario y/o contrase�a inv�lidos.
                </div>
                <div th:if="${param.logout}" class="alert alert-success">
                    Has cerrado sesi�n.
                </div>
                <input type="text" class="form-control" id="username" name="username" placeholder="Usuario"/>
                <input type="password" class="form-control" id="password" name="password" placeholder="Contrase�a"/>
                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">Entrar</button>
                </div>
            </form>
            </div>
            <footer th:replace="fragments/footer :: creditFooter"/>
        </div>
    </body>
</html>