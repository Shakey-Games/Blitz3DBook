;������ ��������� ����������� ����������� ������
bank1=CreateBank(11) ;������� ����1 �������� 11 ����
bank2=CreateBank(6) ;������� ����2 �������� 6 ����
PokeByte bank1,0,255 ;������� �������� ���� Byte � ����
PokeShort bank1,1,65535 ;������� �������� ���� Short � ����
PokeInt bank1,3,2147483647 ;������� �������� ���� Integer � ����
PokeFloat bank1,7,9.99999  ;������� �������� ���� Float � ����
CopyBank bank1,1,bank2,0,6 ;���������� ���������� �� �����1 � ������� 1 � ������ 0 ����� 2 �������� 6 ����
FreeBank bank1 ;������� ���� 1
Print PeekShort(bank2,0) ;������� �������� ���� Short �� ����� 2 � ������� �� �����
Print PeekInt(bank2,2) ;������� �������� ���� Int �� ����� 2 � ������� �� �����
FreeBank bank2 ;������� ���� 2
WaitKey() ;�������� ������� ����� �������
End ;����� ���������