def master(str):
    for i in range(len(str)):
        if not(str[i].isalpha() or str[i].isalnum() or str[i] == '_'):
            return False
        else:
            if len(str) >= 4 and len(str) <= 25:
                if str[0].isalpha():
                    if str[-1] != '_':
                        return True
                    else:
                        return False
                else:
                    return False
            else: 
                return False
