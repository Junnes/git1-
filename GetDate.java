import java.util.*;

public class GetDate { // �½���
	public static void main(String[] args) { // ������
		Date date = new Date(); // ����Date����date
		String year = String.format("%tY", date); // ��date���и�ʽ��
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("�����ǣ�" + year + "��"); // �����Ϣ
		System.out.println("�����ǣ�" + month);
		System.out.println("�����ǣ�" + day + "��");String hour = String.format("%tH", date); // ��date���и�ʽ��
		String minute = String.format("%tM", date);
		String second = String.format("%tS", date);
		 // �������Ϣ
		System.out.println("�����ǣ�" + hour + "ʱ" + minute + "��"
				+ second + "��");
	}
}

		