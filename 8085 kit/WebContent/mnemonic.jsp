<%-- 
    Document   : mnemonic
    Created on : 31-Mar-2019, 9:52:49 PM
    Author     : raushan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                text-align: center;
                overflow: hidden;
                
            }
            hr{
                padding: 0;
                margin: 0;
                border-color: green;
            }
            #tcont{
                overflow-x: hidden;
                overflow-y: scroll;
                height: 88%;
            }
        </style>
    </head>
    <body>
      
        <div id="opptablesearch">
            <input type="text" placeholder="search Mnemonic" id="myInput" onkeyup="searchopp();" >
        </div>
        <br>
        <br>
        
        
        
        <div id="tcont">
        <b>OPP-CODE TABLE</b>
        <hr>
        <br>
        
        <table id="opptable">
            <thead>
<tr>
<td ><strong>S.No.</strong></td>
<td ><strong>Mnemonics, Operand</strong></td>
<td ><strong>Opcode</strong></td>
<td ><strong> Size (Bytes)</strong></td>
</tr>
            </thead >
            <tbody id="myTable">
<tr>
<td>1.</td>
<td>ACI Data</td>
<td>CE</td>
<td>2</td>
</tr>
<tr>
<td>2.</td>
<td>ADC A</td>
<td>8F</td>
<td>1</td>
</tr>
<tr>
<td>3.</td>
<td>ADC B</td>
<td>88</td>
<td>1</td>
</tr>
<tr>
<td>4.</td>
<td>ADC C</td>
<td>89</td>
<td>1</td>
</tr>
<tr>
<td>5.</td>
<td>ADC D</td>
<td>8A</td>
<td>1</td>
</tr>
<tr>
<td>6.</td>
<td>ADC E</td>
<td>8B</td>
<td>1</td>
</tr>
<tr>
<td>7.</td>
<td>ADC H</td>
<td>8C</td>
<td>1</td>
</tr>
<tr>
<td>8.</td>
<td>ADC L</td>
<td>8D</td>
<td>1</td>
</tr>
<tr>
<td>9.</td>
<td>ADC M</td>
<td>8E</td>
<td>1</td>
</tr>
<tr>
<td>10.</td>
<td>ADD A</td>
<td>87</td>
<td>1</td>
</tr>
<tr>
<td>11.</td>
<td>ADD B</td>
<td>80</td>
<td>1</td>
</tr>
<tr>
<td>12.</td>
<td>ADD C</td>
<td>81</td>
<td>1</td>
</tr>
<tr>
<td>13.</td>
<td>ADD D</td>
<td>82</td>
<td>1</td>
</tr>
<tr>
<td>14.</td>
<td>ADD E</td>
<td>83</td>
<td>1</td>
</tr>
<tr>
<td>15.</td>
<td>ADD H</td>
<td>84</td>
<td>1</td>
</tr>
<tr>
<td>16.</td>
<td>ADD L</td>
<td>85</td>
<td>1</td>
</tr>
<tr>
<td>17.</td>
<td>ADD M</td>
<td>86</td>
<td>1</td>
</tr>
<tr>
<td>18.</td>
<td>ADI Data</td>
<td>C6</td>
<td>2</td>
</tr>
<tr>
<td>19.</td>
<td>ANA A</td>
<td>A7</td>
<td>1</td>
</tr>
<tr>
<td>20.</td>
<td>ANA B</td>
<td>A0</td>
<td>1</td>
</tr>
<tr>
<td>21.</td>
<td>ANA C</td>
<td>A1</td>
<td>1</td>
</tr>
<tr>
<td>22.</td>
<td>ANA D</td>
<td>A2</td>
<td>1</td>
</tr>
<tr>
<td>23.</td>
<td>ANA E</td>
<td>A3</td>
<td>1</td>
</tr>
<tr>
<td>24.</td>
<td>ANA H</td>
<td>A4</td>
<td>1</td>
</tr>
<tr>
<td>25.</td>
<td>ANA L</td>
<td>A5</td>
<td>1</td>
</tr>
<tr>
<td>26.</td>
<td>ANA M</td>
<td>A6</td>
<td>1</td>
</tr>
<tr>
<td>27.</td>
<td>ANI Data</td>
<td>E6</td>
<td>2</td>
</tr>
<tr>
<td>28.</td>
<td>CALL Label</td>
<td>CD</td>
<td>3</td>
</tr>
<tr>
<td>29.</td>
<td>CC Label</td>
<td>DC</td>
<td>3</td>
</tr>
<tr>
<td>30.</td>
<td>CM Label</td>
<td>FC</td>
<td>3</td>
</tr>
<tr>
<td>31.</td>
<td>CMA</td>
<td>2F</td>
<td>1</td>
</tr>
<tr>
<td>32.</td>
<td>CMC</td>
<td>3F</td>
<td>1</td>
</tr>
<tr>
<td>33.</td>
<td>CMP A</td>
<td>BF</td>
<td>1</td>
</tr>
<tr>
<td>34.</td>
<td>CMP B</td>
<td>B8</td>
<td>1</td>
</tr>
<tr>
<td>35.</td>
<td>CMP C</td>
<td>B9</td>
<td>1</td>
</tr>
<tr>
<td>36.</td>
<td>CMP D</td>
<td>BA</td>
<td>1</td>
</tr>
<tr>
<td>37.</td>
<td>CMP E</td>
<td>BB</td>
<td>1</td>
</tr>
<tr>
<td>38.</td>
<td>CMP H</td>
<td>BC</td>
<td>1</td>
</tr>
<tr>
<td>39.</td>
<td>CMP L</td>
<td>BD</td>
<td>1</td>
</tr>
<tr>
<td>40.</td>
<td>CMP M</td>
<td>BD</td>
<td>1</td>
</tr>
<tr>
<td>41.</td>
<td>CNC Label</td>
<td>D4</td>
<td>3</td>
</tr>
<tr>
<td>42.</td>
<td>CNZ Label</td>
<td>C4</td>
<td>3</td>
</tr>
<tr>
<td>43.</td>
<td>CP Label</td>
<td>F4</td>
<td>3</td>
</tr>
<tr>
<td>44.</td>
<td>CPE Label</td>
<td>EC</td>
<td>3</td>
</tr>
<tr>
<td>45.</td>
<td>CPI Data</td>
<td>FE</td>
<td>2</td>
</tr>
<tr>
<td>46.</td>
<td>CPO Label</td>
<td>E4</td>
<td>3</td>
</tr>
<tr>
<td>47.</td>
<td>CZ Label</td>
<td>CC</td>
<td>3</td>
</tr>
<tr>
<td>48.</td>
<td>DAA</td>
<td>27</td>
<td>1</td>
</tr>
<tr>
<td>49.</td>
<td>DAD B</td>
<td>09</td>
<td>1</td>
</tr>
<tr>
<td>50.</td>
<td>DAD D</td>
<td>19</td>
<td>1</td>
</tr>
<tr>
<td>51.</td>
<td>DAD H</td>
<td>29</td>
<td>1</td>
</tr>
<tr>
<td>52.</td>
<td>DAD SP</td>
<td>39</td>
<td>1</td>
</tr>
<tr>
<td>53.</td>
<td>DCR A</td>
<td>3D</td>
<td>1</td>
</tr>
<tr>
<td>54.</td>
<td>DCR B</td>
<td>05</td>
<td>1</td>
</tr>
<tr>
<td>55.</td>
<td>DCR C</td>
<td>0D</td>
<td>1</td>
</tr>
<tr>
<td>56.</td>
<td>DCR D</td>
<td>15</td>
<td>1</td>
</tr>
<tr>
<td>57.</td>
<td>DCR E</td>
<td>1D</td>
<td>1</td>
</tr>
<tr>
<td>58.</td>
<td>DCR H</td>
<td>25</td>
<td>1</td>
</tr>
<tr>
<td>59.</td>
<td>DCR L</td>
<td>2D</td>
<td>1</td>
</tr>
<tr>
<td>60.</td>
<td>DCR M</td>
<td>35</td>
<td>1</td>
</tr>
<tr>
<td>61.</td>
<td>DCX B</td>
<td>0B</td>
<td>1</td>
</tr>
<tr>
<td>62.</td>
<td>DCX D</td>
<td>1B</td>
<td>1</td>
</tr>
<tr>
<td>63.</td>
<td>DCX H</td>
<td>2B</td>
<td>1</td>
</tr>
<tr>
<td>64.</td>
<td>DCX SP</td>
<td>3B</td>
<td>1</td>
</tr>
<tr>
<td>65.</td>
<td>DI</td>
<td>F3</td>
<td>1</td>
</tr>
<tr>
<td>66.</td>
<td>EI</td>
<td>FB</td>
<td>1</td>
</tr>
<tr>
<td>67.</td>
<td>HLT</td>
<td>76</td>
<td>1</td>
</tr>
<tr>
<td>68.</td>
<td>IN Port-address</td>
<td>DB</td>
<td>2</td>
</tr>
<tr>
<td>69.</td>
<td>INR A</td>
<td>3C</td>
<td>1</td>
</tr>
<tr>
<td>70.</td>
<td>INR B</td>
<td>04</td>
<td>1</td>
</tr>
<tr>
<td>71.</td>
<td>INR C</td>
<td>0C</td>
<td>1</td>
</tr>
<tr>
<td>72.</td>
<td>INR D</td>
<td>14</td>
<td>1</td>
</tr>
<tr>
<td>73.</td>
<td>INR E</td>
<td>1C</td>
<td>1</td>
</tr>
<tr>
<td>74.</td>
<td>INR H</td>
<td>24</td>
<td>1</td>
</tr>
<tr>
<td>75.</td>
<td>INR L</td>
<td>2C</td>
<td>1</td>
</tr>
<tr>
<td>76.</td>
<td>INR M</td>
<td>34</td>
<td>1</td>
</tr>
<tr>
<td>77.</td>
<td>INX B</td>
<td>03</td>
<td>1</td>
</tr>
<tr>
<td>78.</td>
<td>INX D</td>
<td>13</td>
<td>1</td>
</tr>
<tr>
<td>79.</td>
<td>INX H</td>
<td>23</td>
<td>1</td>
</tr>
<tr>
<td>80.</td>
<td>INX SP</td>
<td>33</td>
<td>1</td>
</tr>
<tr>
<td>81.</td>
<td>JC Label</td>
<td>DA</td>
<td>3</td>
</tr>
<tr>
<td>82.</td>
<td>JM Label</td>
<td>FA</td>
<td>3</td>
</tr>
<tr>
<td>83.</td>
<td>JMP Label</td>
<td>C3</td>
<td>3</td>
</tr>
<tr>
<td>84.</td>
<td>JNC Label</td>
<td>D2</td>
<td>3</td>
</tr>
<tr>
<td>85.</td>
<td>JNZ Label</td>
<td>C2</td>
<td>3</td>
</tr>
<tr>
<td>86.</td>
<td>JP Label</td>
<td>F2</td>
<td>3</td>
</tr>
<tr>
<td>87.</td>
<td>JPE Label</td>
<td>EA</td>
<td>3</td>
</tr>
<tr>
<td>88.</td>
<td>JPO Label</td>
<td>E2</td>
<td>3</td>
</tr>
<tr>
<td>89.</td>
<td>JZ Label</td>
<td>CA</td>
<td>3</td>
</tr>
<tr>
<td>90.</td>
<td>LDA Address</td>
<td>3A</td>
<td>3</td>
</tr>
<tr>
<td>91.</td>
<td>LDAX B</td>
<td>0A</td>
<td>1</td>
</tr>
<tr>
<td>92.</td>
<td>LDAX D</td>
<td>1A</td>
<td>1</td>
</tr>
<tr>
<td>93.</td>
<td>LHLD Address</td>
<td>2A</td>
<td>3</td>
</tr>
<tr>
<td>94.</td>
<td>LXI B</td>
<td>01</td>
<td>3</td>
</tr>
<tr>
<td>95.</td>
<td>LXI D</td>
<td>11</td>
<td>3</td>
</tr>
<tr>
<td>96.</td>
<td>LXI H</td>
<td>21</td>
<td>3</td>
</tr>
<tr>
<td>97.</td>
<td>LXI SP</td>
<td>31</td>
<td>3</td>
</tr>
<tr>
<td>98.</td>
<td>MOV A, A</td>
<td>7F</td>
<td>1</td>
</tr>
<tr>
<td>99.</td>
<td>MOV A, B</td>
<td>78</td>
<td>1</td>
</tr>
<tr>
<td>100.</td>
<td>MOV A, C</td>
<td>79</td>
<td>1</td>
</tr>
<tr>
<td>101.</td>
<td>MOV A, D</td>
<td>7A</td>
<td>1</td>
</tr>
<tr>
<td>102.</td>
<td>MOV A, E</td>
<td>7B</td>
<td>1</td>
</tr>
<tr>
<td>103.</td>
<td>MOV A, H</td>
<td>7C</td>
<td>1</td>
</tr>
<tr>
<td>104.</td>
<td>MOV A, L</td>
<td>7D</td>
<td>1</td>
</tr>
<tr>
<td>105.</td>
<td>MOV A, M</td>
<td>7E</td>
<td>1</td>
</tr>
<tr>
<td>106.</td>
<td>MOV B, A</td>
<td>47</td>
<td>1</td>
</tr>
<tr>
<td>107.</td>
<td>MOV B, B</td>
<td>40</td>
<td>1</td>
</tr>
<tr>
<td>108.</td>
<td>MOV B, C</td>
<td>41</td>
<td>1</td>
</tr>
<tr>
<td>109.</td>
<td>MOV B, D</td>
<td>42</td>
<td>1</td>
</tr>
<tr>
<td>110.</td>
<td>MOV B, E</td>
<td>43</td>
<td>1</td>
</tr>
<tr>
<td>111.</td>
<td>MOV B, H</td>
<td>44</td>
<td>1</td>
</tr>
<tr>
<td>112.</td>
<td>MOV B, L</td>
<td>45</td>
<td>1</td>
</tr>
<tr>
<td>113.</td>
<td>MOV B, M</td>
<td>46</td>
<td>1</td>
</tr>
<tr>
<td>114.</td>
<td>MOV C, A</td>
<td>4F</td>
<td>1</td>
</tr>
<tr>
<td>115.</td>
<td>MOV C, B</td>
<td>48</td>
<td>1</td>
</tr>
<tr>
<td>116.</td>
<td>MOV C, C</td>
<td>49</td>
<td>1</td>
</tr>
<tr>
<td>117.</td>
<td>MOV C, D</td>
<td>4A</td>
<td>1</td>
</tr>
<tr>
<td>118.</td>
<td>MOV C, E</td>
<td>4B</td>
<td>1</td>
</tr>
<tr>
<td>119.</td>
<td>MOV C, H</td>
<td>4C</td>
<td>1</td>
</tr>
<tr>
<td>120.</td>
<td>MOV C, L</td>
<td>4D</td>
<td>1</td>
</tr>
<tr>
<td>121.</td>
<td>MOV C, M</td>
<td>4E</td>
<td>1</td>
</tr>
<tr>
<td>122.</td>
<td>MOV D, A</td>
<td>57</td>
<td>1</td>
</tr>
<tr>
<td>123.</td>
<td>MOV D, B</td>
<td>50</td>
<td>1</td>
</tr>
<tr>
<td>124.</td>
<td>MOV D, C</td>
<td>51</td>
<td>1</td>
</tr>
<tr>
<td>125.</td>
<td>MOV D, D</td>
<td>52</td>
<td>1</td>
</tr>
<tr>
<td>126.</td>
<td>MOV D, E</td>
<td>53</td>
<td>1</td>
</tr>
<tr>
<td>127.</td>
<td>MOV D, H</td>
<td>54</td>
<td>1</td>
</tr>
<tr>
<td>128.</td>
<td>MOV D, L</td>
<td>55</td>
<td>1</td>
</tr>
<tr>
<td>129.</td>
<td>MOV D, M</td>
<td>56</td>
<td>1</td>
</tr>
<tr>
<td>130.</td>
<td>MOV E, A</td>
<td>5F</td>
<td>1</td>
</tr>
<tr>
<td>131.</td>
<td>MOV E, B</td>
<td>58</td>
<td>1</td>
</tr>
<tr>
<td>132.</td>
<td>MOV E, C</td>
<td>59</td>
<td>1</td>
</tr>
<tr>
<td>133.</td>
<td>MOV E, D</td>
<td>5A</td>
<td>1</td>
</tr>
<tr>
<td>134.</td>
<td>MOV E, E</td>
<td>5B</td>
<td>1</td>
</tr>
<tr>
<td>135.</td>
<td>MOV E, H</td>
<td>5C</td>
<td>1</td>
</tr>
<tr>
<td>136.</td>
<td>MOV E, L</td>
<td>5D</td>
<td>1</td>
</tr>
<tr>
<td>137.</td>
<td>MOV E, M</td>
<td>5E</td>
<td>1</td>
</tr>
<tr>
<td>138.</td>
<td>MOV H, A</td>
<td>67</td>
<td>1</td>
</tr>
<tr>
<td>139.</td>
<td>MOV H, B</td>
<td>60</td>
<td>1</td>
</tr>
<tr>
<td>140.</td>
<td>MOV H, C</td>
<td>61</td>
<td>1</td>
</tr>
<tr>
<td>141.</td>
<td>MOV H, D</td>
<td>62</td>
<td>1</td>
</tr>
<tr>
<td>142.</td>
<td>MOV H, E</td>
<td>63</td>
<td>1</td>
</tr>
<tr>
<td>143.</td>
<td>MOV H, H</td>
<td>64</td>
<td>1</td>
</tr>
<tr>
<td>144.</td>
<td>MOV H, L</td>
<td>65</td>
<td>1</td>
</tr>
<tr>
<td>145.</td>
<td>MOV H, M</td>
<td>66</td>
<td>1</td>
</tr>
<tr>
<td>146.</td>
<td>MOV L, A</td>
<td>6F</td>
<td>1</td>
</tr>
<tr>
<td>147.</td>
<td>MOV L, B</td>
<td>68</td>
<td>1</td>
</tr>
<tr>
<td>148.</td>
<td>MOV L, C</td>
<td>69</td>
<td>1</td>
</tr>
<tr>
<td>149.</td>
<td>MOV L, D</td>
<td>6A</td>
<td>1</td>
</tr>
<tr>
<td>150.</td>
<td>MOV L, E</td>
<td>6B</td>
<td>1</td>
</tr>
<tr>
<td>151.</td>
<td>MOV L, H</td>
<td>6C</td>
<td>1</td>
</tr>
<tr>
<td>152.</td>
<td>MOV L, L</td>
<td>6D</td>
<td>1</td>
</tr>
<tr>
<td>153.</td>
<td>MOV L, M</td>
<td>6E</td>
<td>1</td>
</tr>
<tr>
<td>154.</td>
<td>MOV M, A</td>
<td>77</td>
<td>1</td>
</tr>
<tr>
<td>155.</td>
<td>MOV M, B</td>
<td>70</td>
<td>1</td>
</tr>
<tr>
<td>156.</td>
<td>MOV M, C</td>
<td>71</td>
<td>1</td>
</tr>
<tr>
<td>157.</td>
<td>MOV M, D</td>
<td>72</td>
<td>1</td>
</tr>
<tr>
<td>158.</td>
<td>MOV M, E</td>
<td>73</td>
<td>1</td>
</tr>
<tr>
<td>159.</td>
<td>MOV M, H</td>
<td>74</td>
<td>1</td>
</tr>
<tr>
<td>160.</td>
<td>MOV M, L</td>
<td>75</td>
<td>1</td>
</tr>
<tr>
<td>161.</td>
<td>MVI A, Data</td>
<td>3E</td>
<td>2</td>
</tr>
<tr>
<td>162.</td>
<td>MVI B, Data</td>
<td>06</td>
<td>2</td>
</tr>
<tr>
<td>163.</td>
<td>MVI C, Data</td>
<td>0E</td>
<td>2</td>
</tr>
<tr>
<td>164.</td>
<td>MVI D, Data</td>
<td>16</td>
<td>2</td>
</tr>
<tr>
<td>165.</td>
<td>MVI E, Data</td>
<td>1E</td>
<td>2</td>
</tr>
<tr>
<td>166.</td>
<td>MVI H, Data</td>
<td>26</td>
<td>2</td>
</tr>
<tr>
<td>167.</td>
<td>MVI L, Data</td>
<td>2E</td>
<td>2</td>
</tr>
<tr>
<td>168.</td>
<td>MVI M, Data</td>
<td>36</td>
<td>2</td>
</tr>
<tr>
<td>169.</td>
<td>NOP</td>
<td>00</td>
<td>1</td>
</tr>
<tr>
<td>170.</td>
<td>ORA A</td>
<td>B7</td>
<td>1</td>
</tr>
<tr>
<td>171.</td>
<td>ORA B</td>
<td>B0</td>
<td>1</td>
</tr>
<tr>
<td>172.</td>
<td>ORA C</td>
<td>B1</td>
<td>1</td>
</tr>
<tr>
<td>173.</td>
<td>ORA D</td>
<td>B2</td>
<td>1</td>
</tr>
<tr>
<td>174.</td>
<td>ORA E</td>
<td>B3</td>
<td>1</td>
</tr>
<tr>
<td>175.</td>
<td>ORA H</td>
<td>B4</td>
<td>1</td>
</tr>
<tr>
<td>176.</td>
<td>ORA L</td>
<td>B5</td>
<td>1</td>
</tr>
<tr>
<td>177.</td>
<td>ORA M</td>
<td>B6</td>
<td>1</td>
</tr>
<tr>
<td>178.</td>
<td>ORI Data</td>
<td>F6</td>
<td>2</td>
</tr>
<tr>
<td>179.</td>
<td>OUT Port-Address</td>
<td>D3</td>
<td>2</td>
</tr>
<tr>
<td>180.</td>
<td>PCHL</td>
<td>E9</td>
<td>1</td>
</tr>
<tr>
<td>181.</td>
<td>POP B</td>
<td>C1</td>
<td>1</td>
</tr>
<tr>
<td>182.</td>
<td>POP D</td>
<td>D1</td>
<td>1</td>
</tr>
<tr>
<td>183.</td>
<td>POP H</td>
<td>E1</td>
<td>1</td>
</tr>
<tr>
<td>184.</td>
<td>POP PSW</td>
<td>F1</td>
<td>1</td>
</tr>
<tr>
<td>185.</td>
<td>PUSH B</td>
<td>C5</td>
<td>1</td>
</tr>
<tr>
<td>186.</td>
<td>PUSH D</td>
<td>D5</td>
<td>1</td>
</tr>
<tr>
<td>187.</td>
<td>PUSH H</td>
<td>E5</td>
<td>1</td>
</tr>
<tr>
<td>188.</td>
<td>PUSH PSW</td>
<td>F5</td>
<td>1</td>
</tr>
<tr>
<td>189.</td>
<td>RAL</td>
<td>17</td>
<td>1</td>
</tr>
<tr>
<td>190.</td>
<td>RAR</td>
<td>1F</td>
<td>1</td>
</tr>
<tr>
<td>191.</td>
<td>RC</td>
<td>D8</td>
<td>1</td>
</tr>
<tr>
<td>192.</td>
<td>RET</td>
<td>C9</td>
<td>1</td>
</tr>
<tr>
<td>193.</td>
<td>RIM</td>
<td>20</td>
<td>1</td>
</tr>
<tr>
<td>194.</td>
<td>RLC</td>
<td>07</td>
<td>1</td>
</tr>
<tr>
<td>195.</td>
<td>RM</td>
<td>F8</td>
<td>1</td>
</tr>
<tr>
<td>196.</td>
<td>RNC</td>
<td>D0</td>
<td>1</td>
</tr>
<tr>
<td>197.</td>
<td>RNZ</td>
<td>C0</td>
<td>1</td>
</tr>
<tr>
<td>198.</td>
<td>RP</td>
<td>F0</td>
<td>1</td>
</tr>
<tr>
<td>199.</td>
<td>RPE</td>
<td>E8</td>
<td>1</td>
</tr>
<tr>
<td>200.</td>
<td>RPO</td>
<td>E0</td>
<td>1</td>
</tr>
<tr>
<td>201.</td>
<td>RRC</td>
<td>0F</td>
<td>1</td>
</tr>
<tr>
<td>202.</td>
<td>RST 0</td>
<td>C7</td>
<td>1</td>
</tr>
<tr>
<td>203.</td>
<td>RST 1</td>
<td>CF</td>
<td>1</td>
</tr>
<tr>
<td>204.</td>
<td>RST 2</td>
<td>D7</td>
<td>1</td>
</tr>
<tr>
<td>205.</td>
<td>RST 3</td>
<td>DF</td>
<td>1</td>
</tr>
<tr>
<td>206.</td>
<td>RST 4</td>
<td>E7</td>
<td>1</td>
</tr>
<tr>
<td>207.</td>
<td>RST 5</td>
<td>EF</td>
<td>1</td>
</tr>
<tr>
<td>208.</td>
<td>RST 6</td>
<td>F7</td>
<td>1</td>
</tr>
<tr>
<td>209.</td>
<td>RST 7</td>
<td>FF</td>
<td>1</td>
</tr>
<tr>
<td>210.</td>
<td>RZ</td>
<td>C8</td>
<td>1</td>
</tr>
<tr>
<td>211.</td>
<td>SBB A</td>
<td>9F</td>
<td>1</td>
</tr>
<tr>
<td>212.</td>
<td>SBB B</td>
<td>98</td>
<td>1</td>
</tr>
<tr>
<td>213.</td>
<td>SBB C</td>
<td>99</td>
<td>1</td>
</tr>
<tr>
<td>214.</td>
<td>SBB D</td>
<td>9A</td>
<td>1</td>
</tr>
<tr>
<td>215.</td>
<td>SBB E</td>
<td>9B</td>
<td>1</td>
</tr>
<tr>
<td>216.</td>
<td>SBB H</td>
<td>9C</td>
<td>1</td>
</tr>
<tr>
<td>217.</td>
<td>SBB L</td>
<td>9D</td>
<td>1</td>
</tr>
<tr>
<td>218.</td>
<td>SBB M</td>
<td>9E</td>
<td>1</td>
</tr>
<tr>
<td>219.</td>
<td>SBI Data</td>
<td>DE</td>
<td>2</td>
</tr>
<tr>
<td>220.</td>
<td>SHLD Address</td>
<td>22</td>
<td>3</td>
</tr>
<tr>
<td>221.</td>
<td>SIM</td>
<td>30</td>
<td>1</td>
</tr>
<tr>
<td>222.</td>
<td>SPHL</td>
<td>F9</td>
<td>1</td>
</tr>
<tr>
<td>223.</td>
<td>STA Address</td>
<td>32</td>
<td>3</td>
</tr>
<tr>
<td>224.</td>
<td>STAX B</td>
<td>02</td>
<td>1</td>
</tr>
<tr>
<td>225.</td>
<td>STAX D</td>
<td>12</td>
<td>1</td>
</tr>
<tr>
<td>226.</td>
<td>STC</td>
<td>37</td>
<td>1</td>
</tr>
<tr>
<td>227.</td>
<td>SUB A</td>
<td>97</td>
<td>1</td>
</tr>
<tr>
<td>228.</td>
<td>SUB B</td>
<td>90</td>
<td>1</td>
</tr>
<tr>
<td>229.</td>
<td>SUB C</td>
<td>91</td>
<td>1</td>
</tr>
<tr>
<td>230.</td>
<td>SUB D</td>
<td>92</td>
<td>1</td>
</tr>
<tr>
<td>231.</td>
<td>SUB E</td>
<td>93</td>
<td>1</td>
</tr>
<tr>
<td>232.</td>
<td>SUB H</td>
<td>94</td>
<td>1</td>
</tr>
<tr>
<td>233.</td>
<td>SUB L</td>
<td>95</td>
<td>1</td>
</tr>
<tr>
<td>234.</td>
<td>SUB M</td>
<td>96</td>
<td>1</td>
</tr>
<tr>
<td>235.</td>
<td>SUI Data</td>
<td>D6</td>
<td>2</td>
</tr>
<tr>
<td>236.</td>
<td>XCHG</td>
<td>EB</td>
<td>1</td>
</tr>
<tr>
<td>237.</td>
<td>XRA A</td>
<td>AF</td>
<td>1</td>
</tr>
<tr>
<td>238.</td>
<td>XRA B</td>
<td>A8</td>
<td>1</td>
</tr>
<tr>
<td>239.</td>
<td>XRA C</td>
<td>A9</td>
<td>1</td>
</tr>
<tr>
<td>240.</td>
<td>XRA D</td>
<td>AA</td>
<td>1</td>
</tr>
<tr>
<td>241.</td>
<td>XRA E</td>
<td>AB</td>
<td>1</td>
</tr>
<tr>
<td>242.</td>
<td>XRA H</td>
<td>AC</td>
<td>1</td>
</tr>
<tr>
<td>243.</td>
<td>XRA L</td>
<td>AD</td>
<td>1</td>
</tr>
<tr>
<td>244.</td>
<td>XRA M</td>
<td>AE</td>
<td>1</td>
</tr>
<tr>
<td>245.</td>
<td>XRI Data</td>
<td>EE</td>
<td>2</td>
</tr>
<tr>
<td>246.</td>
<td>XTHL</td>
<td>E3</td>
<td>1</td>
</tr>
</tbody>
        </table>
        
        </div>      
        
        
    </body>
</html>
