# Função de autenticação
def autenticar_usuario(username, password):
    users = {"user1": "password123", "user2": "pass456", "user3": "securepwd789"}

    if username in users:
        if users[username] == password:
            return "Acesso concedido"
        else:
            return "Senha incorreta"
    else:
        return "Usuário não encontrado"


# usuario e senha corretos
def test_autenticar_usuario_caso1():
    username = "user1"
    password = "password123"
    resultado = autenticar_usuario(username, password)
    assert resultado == "Acesso concedido"


# usuario correto e senha incorreta
def test_autenticar_usuario_caso2():
    username = "user2"
    password = "wrongpassword"
    resultado = autenticar_usuario(username, password)
    assert resultado == "Senha incorreta"


# usuario não encontrado
def test_autenticar_usuario_caso3():
    username = "user4"
    password = "anypassword"
    resultado = autenticar_usuario(username, password)
    assert resultado == "Usuário não encontrado"
