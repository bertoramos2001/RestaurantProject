package Integracion.Almacendeldominio;

import java.util.concurrent.ConcurrentHashMap;

public class TransactionManagerImp extends TransactionManager {

	private ConcurrentHashMap<Thread, Transaction> transactions;
	
	public TransactionManagerImp(){
		transactions = new ConcurrentHashMap<Thread, Transaction>();
	}

	@Override
	public Transaction newTransaction() {
		Transaction t = transactions.get(Thread.currentThread());
		if(t == null){
			TransactionFactory tf = TransactionFactory.getInstance();
			t = tf.newTransaction();
			transactions.put(Thread.currentThread(), t);
		}
		return t;
	}

	@Override
	public Transaction getTransaction() {
		return transactions.get(Thread.currentThread());
	}

	@Override
	public void deleteTransaction() {
		Transaction transaction = transactions.get(Thread.currentThread());
		if(transaction != null){
			transactions.remove(Thread.currentThread());
		}
	}
}