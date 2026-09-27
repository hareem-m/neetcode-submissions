class Solution:

    def encode(self, strs: List[str]) -> str:
        string = "bjhbhj".join(strs);
        if not strs:
            return "emptyList"
        return string

    def decode(self, s: str) -> List[str]:
        array = s.split("bjhbhj")
        if s == "emptyList":
            return []
        return array
