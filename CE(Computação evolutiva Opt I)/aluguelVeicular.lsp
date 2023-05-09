(defclass veiculo ()
  ((tipo-veiculo :accessor tipo-veiculo :initarg :tipo-veiculo :type string)
   (marca :accessor marca :initarg :marca :type string)
   (modelo :accessor modelo :initarg :modelo :type string)
   (ano-fabricacao :accessor ano-fabricacao :initarg :ano-fabricacao :type integer)
   (ano-modelo :accessor ano-modelo :initarg :ano-modelo :type integer)))
   (defclass cliente ()
  ((nome :accessor nome :initarg :nome :type string)
   (cpf :accessor cpf :initarg :cpf :type string)
   (endereco :accessor endereco :initarg :endereco :type string)
   (telefone :accessor telefone :initarg :telefone :type string)))

(defclass aluguel ()
  ((data-retirada :accessor data-retirada :initarg :data-retirada :type date)
   (data-devolucao :accessor data-devolucao :initarg :data-devolucao :type date)
   (orcamento :accessor orcamento :initarg :orcamento :type double-float)
   (status :accessor status :initarg :status :type string)
   (cpf-cliente :accessor cpf-cliente :initarg :cpf-cliente :type cliente)
   (veiculo :accessor veiculo :initarg :veiculo :type veiculo)))

(defclass pagamento ()
  ((tipo-pagamento :accessor tipo-pagamento :initarg :tipo-pagamento :type string)
   (condicao :accessor condicao :initarg :condicao :type string)
   (forma-pagamento :accessor forma-pagamento :initarg :forma-pagamento :type string)))

(defclass parcela ()
  ((id :accessor id :initarg :id :type integer)
   (valor :accessor valor :initarg :valor :type double-float)
   (data-vencimento :accessor data-vencimento :initarg :data-vencimento :type date)
   (data-pagamento :accessor data-pagamento :initarg :data-pagamento :type date)
   (juros :accessor juros :initarg :juros :type double-float)))

   (setq meu-veiculo (make-instance 'veiculo :tipo-veiculo "Carro" :marca "Ford" :modelo "Fiesta" :ano-fabricacao 2022 :ano-modelo 2023))

(setq meu-cliente (make-instance 'cliente :nome "João" :cpf "123.456.789-10" :endereco "Rua 1, nº 100" :telefone "(11) 99999-9999"))

(setq meu-aluguel (make-instance 'aluguel :data-retirada (parse-time-string "2023-05-10") :data-devolucao (parse-time-string "2023-05-15") :orcamento 500.0 :status "Pendente" :cpf-cliente meu-cliente :veiculo meu-veiculo))

(setq meu-pagamento (make-instance 'pagamento :tipo-pagamento "Cartão de crédito" :condicao "À vista" :forma-pagamento "Mastercard"))

(setq minha-parcela (make-instance 'parcela :id 1 :valor 250.0 :data-vencimento (parse-time-string "2023-06-10") :juros 0.05))