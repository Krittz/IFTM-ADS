package controller;

import dao.AgenciaDAO;
import java.time.LocalTime;
import java.util.List;
import model.Agencia;

/**
 *
 * @author crist
 */
public class AgenciaController {

    private AgenciaDAO agenciaDAO;

    public AgenciaController() {
        agenciaDAO = new AgenciaDAO();
    }

    public void salvar(String nome, LocalTime abre, LocalTime fecha, String telefone, String logradouro, int numero, String bairro, String cep, String complemento) {
        Agencia ag = new Agencia();
        ag.setNome(nome);
        ag.setHoraAbre(abre);
        ag.setHoraFecha(fecha);
        ag.setTelefone(telefone);
        ag.setLogradouro(logradouro);
        ag.setNumero(numero);
        ag.setBairro(bairro);
        ag.setCep(cep);
        ag.setComplemento(complemento);
        agenciaDAO.salvarAgencia(ag);
    }

    public void excluir(int codigo) {
        agenciaDAO.excluir(codigo);
    }

    public List<Agencia> buscarAgencias() {
        return agenciaDAO.buscarAgencias();
    }

    public List<Agencia> agenciasAtivas() {
        return agenciaDAO.agenciasAtivas();
    }

    public Agencia buscarAgencia(int codigo) {
        return agenciaDAO.buscarAgencia(codigo);
    }

    public void atualizar(int codigo, String nome, String telefone, LocalTime abre, LocalTime fecha, String logradouro, int numero, String bairro, String cep, String complemento) {
        agenciaDAO.atualizar(codigo, nome, telefone, abre, fecha, logradouro, numero, bairro, cep, complemento);
    }
}
