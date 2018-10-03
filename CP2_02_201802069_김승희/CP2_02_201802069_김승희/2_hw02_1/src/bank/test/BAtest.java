package bank.test;

import static org.junit.jupiter.api.Assertions.fail;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import bank.BankAccount;

class BAtest {
	BankAccount ba=new BankAccount("±è½ÂÈñ",300000,0.1);
	@Test
	void testGetName() {
		assertEquals("±è½ÂÈñ" ,ba.getName());
	}

	@Test
	void testGetBalance() {
		assertEquals(300000 ,ba.getBalance());
	}

	@Test
	void testDeposit() {
		assertEquals(400000,ba.deposit(100000));
	}

	@Test
	void testWithdraw() {
		assertEquals(200000,ba.withdraw(100000));
	}

	@Test
	void testInstallmentSavingPredict() {
		assertEquals(426500,ba.installmentSavingPredict(12, 10000));
	}

	@Test
	void testFixedDepositPredict() {
		assertEquals(2806899,ba.fixedDepositPredict(24, 2000000));
	}

}
