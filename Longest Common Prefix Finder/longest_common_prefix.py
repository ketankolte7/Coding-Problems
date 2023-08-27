def longest_common_prefix(strs):
    if not strs:
        return ""
    min_len = min(len(s) for s in strs)
    common_prefix = ""
    for i in range(min_len):
        char = strs[0][i]
        if all(s[i] == char for s in strs):
            common_prefix += char
        else:
            break
    return common_prefix
    
# Test scenarios

strs1 = ["light", "live", "liver"]
print(longest_common_prefix(strs1))

strs2 = ["light", "racecar", "car"]
print(longest_common_prefix(strs2))
