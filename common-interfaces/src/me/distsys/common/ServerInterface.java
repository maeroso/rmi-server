package me.distsys.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

// interface de métodos do servidor
public interface ServerInterface extends Remote {

    /**
     * método de consulta de tickets
     * @param origem, destino, dataIda, dataVolta, numeroPessoas
     * @throws RemoteException
     */
    String consultPlaneTickets(String origem, String destino, String dataIda, String dataVolta, int numeroPessoas) throws RemoteException;

    /**
     * método de compra de tickets
     * @param origem, destino, dataIda, dataVolta, numeroPessoas
     * @throws RemoteException
     */
    void buyPlaneTickets(String origem, String destino, String dataIda, String dataVolta, int numeroPessoas) throws RemoteException;


    /**
     * método de consulta de pacotes
     * @param origem, destino, dataIda, dataVolta, numeroPessoas, hotel, dataEntrada, dataSaida, numeroQuartos
     * @throws RemoteException
     */
    void consultPackages(String origem, String destino, String dataIda, String dataVolta, int numeroPessoas, String hotel, String dataEntrada, String dataSaida, int numeroQuartos) throws RemoteException;

    /**
     * método de compra de pacotes
     * @param origem, destino, dataIda, dataVolta, numeroPessoas, hotel, dataEntrada, dataSaida, numeroQuartos
     * @throws RemoteException
     */
    void buyPackage(String origem, String destino, String dataIda, String dataVolta, int numeroPessoas, String hotel, String dataEntrada, String dataSaida, int numeroQuartos) throws RemoteException;


    /**
     * método de consulta de hospedagem
     * @param hotel, dataEntrada, dataSaida, numeroQuartos, numeroPessoas
     * @throws RemoteException
     */
    void consultAccomodation(String hotel, String dataEntrada, String dataSaida, int numeroQuartos, int numeroPessoas) throws RemoteException;

    /**
     * método de compra de hospedagem
     * @param hotel, dataEntrada, dataSaida, numeroQuartos, numeroPessoas
     * @throws RemoteException
     */
    void buyAccomodation(String hotel, String dataEntrada, String dataSaida, int numeroQuartos, int numeroPessoas) throws RemoteException;


    /**
     * cadastra voo
     * @param origem, destino, data, vagas, preço
     * @throws RemoteException
     */
    void addFlight(String origem,String destino,String data, int vagas, int preco) throws RemoteException;

    /**
     * cadastra hotel
     * @param hotel, dataEntrada, dataSaida, numeroQuartos, numeroPessoas, preçoQuarto, preçoPessoa
     * @throws RemoteException
     */
    void addAccommodation(String hotel,String dataEntrada,String dataSaida, int numeroQuartos, int numeroPessoas, int precoQuarto, int precoPessoa) throws RemoteException;
}
