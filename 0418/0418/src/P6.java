
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޷� ��� 
		
		//1�� 1���� ó�� �����ϴ� ������ �ݿ����̴� = > 
		int k24_Weekday = 5;
		int[] k24_End = {31,29,31,30,31,30,31,31,30,31,30,31};
		for (int k24_Mon = 0; k24_Mon < 12; k24_Mon++) {
			System.out.printf("%14d��\t\n", k24_Mon + 1);
			System.out.printf("=============================\n");
			System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","��","��","ȭ","��","��","��","��");			
			 for (int k24_i = 1; k24_i <= k24_Weekday; k24_i++) { // 1�� 1���� �ݿ��� => ���� "��" �ձ���
		            System.out.printf("%4s"," "); //��ĭ ����ؼ� ���� �����ġ ���� +=> 4 * 5 = 20ĭ
		         }
			 for (int k24_i = 1; k24_i <= k24_End[k24_Mon]; k24_i++) { //1���� �� ���� ������ ���ڱ��� �ݺ�
		            System.out.printf("%4d", k24_i);
				
		         // k24_Weekday�� ���� �þ��
					k24_Weekday++;    
		            
		        // k24_Weekday �� 7�� �������� 0�̸� "\n"���� �� �� ����
				if ((k24_Weekday) % 7 == 0) {
					System.out.println();
				}
			}
			 k24_Weekday %= 7; 
			 System.out.println();
		}
	}

}
