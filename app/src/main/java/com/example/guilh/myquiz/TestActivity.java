package com.example.guilh.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestActivity extends AppCompatActivity {

    private ArrayList<Question> questions;
    private int position = 0;
    private Control stats = new Control();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        stats.difficulty = getIntent().getIntExtra("diff",0);
        stats.prevPoints = 0;
        stats.points = 0;
        stats.nextPoints = 1000;
        createTest();
        refreshQuestion();
    }

    private void createTest(){

        questions = new ArrayList<>();
        Question q1 = new Question();
        q1.question="Os tipos de transmissão são:";
        q1.answer="Simplex, Half-Duplex e Full-Duplex";
        q1.options = new String[]{"Síncrono, Half-Duplex e Full-Duplex",
                                  "Síncrono, Assíncrono e Simplex",
                                  "Simplex, Half-Duplex e Full-Duplex",
                                  "Síncrono, Assíncrono e Duplex"};
        questions.add(q1);

        Question q2 = new Question();
        q2.question="Não é tipo de modulação:";
        q2.answer="WM – Wave Modulation";
        q2.options = new String[]{"AM – Amplitude Modulation",
                                  "PM – Phase Modulation",
                                  "FM – Frequency Modulation",
                                  "WM – Wave Modulation"};
        questions.add(q2);

        Question q3 = new Question();
        q3.question="Não é um tipo de transmissão por radiofreqüência:";
        q3.answer="N.d.a.";
        q3.options = new String[]{"Enlace via Rádio",
                                  "Microondas",
                                  "Wi-Fi",
                                  "N.d.a."};
        questions.add(q3);

        Question q4 = new Question();
        q4.question="É recomendado a utilização de cabo UTP para dados a partir de:";
        q4.answer="Cat3";
        q4.options = new String[]{"Cat1",
                                  "Cat2",
                                  "Cat3",
                                  "Cat5"};
        questions.add(q4);

        Question q5 = new Question();
        q5.question="Não é um tipo de multiplexação:";
        q5.answer="ODM";
        q5.options = new String[]{"WDM",
                "TDM",
                "FDM",
                "ODM"};
        questions.add(q5);

        Question q6 = new Question();
        q6.question="Não é um tipo de rede:";
        q6.answer="N.d.a.";
        q6.options = new String[]{"LAN",
                "WAN",
                "MAN",
                "N.d.a."};
        questions.add(q6);

        Question q7 = new Question();
        q7.question="É um tipo de topologia de redes :";
        q7.answer="Híbrida";
        q7.options = new String[]{"Secret Token",
                "Híbrida",
                "Token Star",
                "Ring Bar"};
        questions.add(q7);

        Question q8 = new Question();
        q8.question="Unificar os meios de conexão para obtenção de mais banda é chamado de:";
        q8.answer="Link Agregation";
        q8.options = new String[]{"Link Segregation",
                "Link Absolut",
                "Link Multiplex",
                "Link Agregation"};
        questions.add(q8);

        Question q9 = new Question();
        q9.question="Os tipos de luz utilizados em fibra ótica são...e os tipos de fibra são...(respectivamente)";
        q9.answer="LED e Laser, Multimodo e Monomodo";
        q9.options = new String[]{"Multimodo e Monomodo, LED e Laser",
                "TDM e STDM, LED e Laser",
                "LED e Laser, Multimodo e Monomodo",
                "LED e Laser, TDM e STDM"};
        questions.add(q9);

        Question q10 = new Question();
        q10.question="A camada de redes é responsável por:";
        q10.answer="Roteamento e Encapsulamento";
        q10.options = new String[]{"Controle dos TPDU’s",
                "Roteamento e Encapsulamento",
                "Verificação de erros no nível físico",
                "Verificar o MAC"};
        questions.add(q10);

        Question q11 = new Question();
        q11.question="Um IP para redes internas NÃO é:";
        q11.answer="200.210.168.139";
        q11.options = new String[]{"10.1.0.1",
                "200.210.168.139",
                "172.16.194.1",
                "192.168.0.5"};
        questions.add(q11);

        Question q12 = new Question();
        q12.question="Existem 2 tipos de dispositivos de conectividade:";
        q12.answer="Gerenciáveis e Não Gerenciáveis";
        q12.options = new String[]{"Gerenciáveis e Não Gerenciáveis",
                "Conectáveis e Não Conectáveis",
                "Espertos e Não Espertos",
                "Dobráveis e Não Dobráveis"};
        questions.add(q12);

        Question q13 = new Question();
        q13.question="No modelo OSI:";
        q13.answer="As camadas inferiores prestam \nserviço para as camadas superiores";
        q13.options = new String[]{"As camadas inferiores prestam \nserviço para as camadas superiores",
                "As tarefas são centralizadas em uma camada",
                "Camadas do mesmo nível nunca se comunicam",
                "N.d.a."};
        questions.add(q13);

        Question q14 = new Question();
        q14.question="As arquiteturas de rede Ethernet, Token Ring , e FDDI, no modelo OSI, operam na(s) camada(s):";
        q14.answer="1e2";
        q14.options = new String[]{"3",
                "1, 2 e 3",
                "2",
                "1 e 2"};
        questions.add(q14);

        Question q15 = new Question();
        q15.question="Em quantas camadas se divide o modelo de referência OSI?";
        q15.answer="7 camadas";
        q15.options = new String[]{"3 camadas",
                "5 camadas",
                "7 camadas",
                "6 camadas"};
        questions.add(q15);

        Question q16 = new Question();
        q16.question="Qual dos cabos abaixo foi o primeiro a aparecer na estrutura de rede?";
        q16.answer="Cabo coaxial";
        q16.options = new String[]{"Cabo par trançado",
                "Cabo de fibra óptica",
                "Cabo coaxial",
                "Cabo categoria 5e"};
        questions.add(q16);

        Question q17 = new Question();
        q17.question="Quais são os principais protocolos da camada de Transporte?";
        q17.answer="TCP E UDP";
        q17.options = new String[]{"IP E TCP",
                "TCP E UDP",
                "HTTP E SMTP",
                "UDP E POP"};
        questions.add(q17);

        Question q18 = new Question();
        q18.question="Como é denominado o protocolo de configuração dinâmica de IP?";
        q18.answer="DHCP";
        q18.options = new String[]{"HTTP",
                "FTP",
                "DHCP",
                "DNS"};
        questions.add(q18);

        Question q19 = new Question();
        q19.question="A qual camada pertence o protocolo IP?";
        q19.answer="Rede";
        q19.options = new String[]{"Enlace",
                "Transporte",
                "Rede",
                "Física"};
        questions.add(q19);

        Question q20 = new Question();
        q20.question="Na classe padrão C, quantos bytes são reservados para redes?";
        q20.answer="03 bytes";
        q20.options = new String[]{"02 bytes",
                "01 byte",
                "03 bytes",
                "04 bytes"};
        questions.add(q20);

        Question q21 = new Question();
        q21.question="Como é denominado o dado (PDU) na camada de Aplicação?";
        q21.answer="Dado";
        q21.options = new String[]{"Segmento",
                "Pacote",
                "Quadro",
                "Dado"};
        questions.add(q21);

        Question q22 = new Question();
        q22.question="Como é denominado o dado (PDU) na camada de transporte?";
        q22.answer="Segmento";
        q22.options = new String[]{"Segmento",
                "Pacote",
                "Quadro",
                "Dado"};
        questions.add(q22);

        Question q23 = new Question();
        q23.question="Qual camada do Modelo OSI é responsável pela correção de erros e fluxo de dados de modo básico?";
        q23.answer="Enlace";
        q23.options = new String[]{"Apresentação",
                "Sessão",
                "Enlace",
                "Física"};
        questions.add(q23);

        Question q24 = new Question();
        q24.question="O que é P2P?";
        q24.answer="Peer-to-Peer";
        q24.options = new String[]{"Peer-to-Peer",
                "PHP",
                "Powerpoint",
                "Player-to-Player"};
        questions.add(q24);

        Question q25 = new Question();
        q25.question="Qual desses tipos de conexões cobrem cidades?";
        q25.answer="MAN";
        q25.options = new String[]{"WAN",
                "MAN",
                "PAN",
                "LAN"};
        questions.add(q25);

        Question q26 = new Question();
        q26.question="Quem é o hardware \"Guarda de Trânsito\" dessa lista?";
        q26.answer="Roteador";
        q26.options = new String[]{"Modem",
                "Placa de rede",
                "Roteador",
                "Cabo de fibra óptica"};
        questions.add(q26);

        Question q27 = new Question();
        q27.question="Que nome pode ser dado aos servidores?";
        q27.answer="Data-Centers";
        q27.options = new String[]{"Data-Panels",
                "File-Panel",
                "World-Centers",
                "Data-Centers"};
        questions.add(q27);

        Question q28 = new Question();
        q28.question="O que é a tecnologia Broadcast?";
        q28.answer="Transmissão simultânea para todos os hosts na rede.";
        q28.options = new String[]{"Transmissão simultânea para todos os hosts na rede.",
                "Transmissão aleatória na rede.",
                "Modo de transferência de arquivos mais rápido.",
                "Modo de transferência de arquivos lento."};
        questions.add(q28);

        Question q29 = new Question();
        q29.question="Quantas camadas tem o modelo padrão TCP/IP?";
        q29.answer="4 camadas";
        q29.options = new String[]{"3 camadas",
                "4 camadas",
                "7 camadas",
                "2 camadas"};
        questions.add(q29);

        Question q30 = new Question();
        q30.question="O que significa SMTP?";
        q30.answer="Simple Mail Transfer Protocol";
        q30.options = new String[]{"Sample MAN Transfer Protocol",
                "Simple Mailer Time Protocol",
                "Simple Mail Transfer Protocol",
                "Sample Mail Transfer Protocol"};
        questions.add(q30);


        Collections.shuffle(questions);
        Collections.shuffle(Arrays.asList(q1.options));
        Collections.shuffle(Arrays.asList(q2.options));
        Collections.shuffle(Arrays.asList(q3.options));
        Collections.shuffle(Arrays.asList(q4.options));
        Collections.shuffle(Arrays.asList(q5.options));
        Collections.shuffle(Arrays.asList(q6.options));
        Collections.shuffle(Arrays.asList(q7.options));
        Collections.shuffle(Arrays.asList(q8.options));
        Collections.shuffle(Arrays.asList(q9.options));
        Collections.shuffle(Arrays.asList(q10.options));
        Collections.shuffle(Arrays.asList(q11.options));
        Collections.shuffle(Arrays.asList(q12.options));
        Collections.shuffle(Arrays.asList(q13.options));
        Collections.shuffle(Arrays.asList(q14.options));
        Collections.shuffle(Arrays.asList(q15.options));
        Collections.shuffle(Arrays.asList(q16.options));
        Collections.shuffle(Arrays.asList(q17.options));
        Collections.shuffle(Arrays.asList(q18.options));
        Collections.shuffle(Arrays.asList(q19.options));
        Collections.shuffle(Arrays.asList(q20.options));
        Collections.shuffle(Arrays.asList(q21.options));
        Collections.shuffle(Arrays.asList(q22.options));
        Collections.shuffle(Arrays.asList(q23.options));
        Collections.shuffle(Arrays.asList(q24.options));
        Collections.shuffle(Arrays.asList(q25.options));
        Collections.shuffle(Arrays.asList(q26.options));
        Collections.shuffle(Arrays.asList(q27.options));
        Collections.shuffle(Arrays.asList(q28.options));
        Collections.shuffle(Arrays.asList(q29.options));
        Collections.shuffle(Arrays.asList(q30.options));
    }

    private void refreshQuestion(){

        Question q = questions.get(position);
        TextView qTextView = (TextView) findViewById(R.id.textView2);
        qTextView.setText(q.question);

        RadioButton opt1 = (RadioButton) findViewById(R.id.radioButton);
        opt1.setText(q.options[0]);
        opt1.setSelected(false);

        RadioButton opt2 = (RadioButton) findViewById(R.id.radioButton2);
        opt2.setText(q.options[1]);
        opt2.setSelected(false);

        RadioButton opt3 = (RadioButton) findViewById(R.id.radioButton3);
        opt3.setText(q.options[2]);
        opt3.setSelected(false);

        RadioButton opt4 = (RadioButton) findViewById(R.id.radioButton4);
        opt4.setText(q.options[3]);
        opt4.setSelected(false);
    }

    public void nextQuestion(View view){


        Question q = questions.get(position);

        //Busca o ID do RadioButton que foi selecionado
        RadioGroup radioButtonGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        RadioButton optionSelected = (RadioButton) findViewById(radioButtonID);

        String answer = (String) optionSelected.getText();
        //Verifica se a resposta está certa
        if(answer.equals(q.answer)){
            position++;
            radioButtonGroup.clearCheck();

            //Verifica se o limite de questões da dificuldade foi atingido
            if(position < stats.difficulty){
                refreshQuestion();
            }else{
                
            }
        }
    }

}
