Graphics3D 640,480 ;3D ����������� �����

cam=CreateCamera() ;�������� ������

a=CreateTerrain(2) ;�������� �������� ( � ������ ���������� ������ 1 , 2 , 4 , 8 , 16 , 32 , ����� ������������� ������ � ��� ���� )

PositionEntity a,-1,-1,2 ;������� �������

RenderWorld ;���������� ���
Flip ;��������� ����������� �����

WaitKey() ;������������� ��������� �� ��� ��� ���� �� ������ ����� �������

End ;�����
